package model;

import java.util.ArrayList;
import java.util.Date;

public class Pegawai {
//    attribute
    private String idPegawai;
    private String namaPegawai;
    private int jarakRumahKeKantor;
    private int masaKerjaPegawai;
    private int lembur;
    private double gajihAwal;
    private double gajihAkhir;
    private double tunjanganLembur;
    private double tunjanganTransportasi;

//    constructor
    public Pegawai() {
        idPegawai = "Id Masih Kosong Atau Tidak Ditemukan";
        namaPegawai = "Nama Masih Kosong Atau Tidak Ditemukan";
    }

    public Pegawai(String idPegawai, String namaPegawai, int jarakRumahKeKantor, int masaKerjaPegawai, int lembur,
                   double gajihAwal, double gajihAkhir, double tunjanganLembur, double tunjanganTransportasi) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.jarakRumahKeKantor = jarakRumahKeKantor;
        this.masaKerjaPegawai = masaKerjaPegawai;
        this.lembur = lembur;
        this.gajihAwal = gajihAwal;
        this.gajihAkhir = gajihAkhir;
        this.tunjanganLembur = tunjanganLembur;
        this.tunjanganTransportasi = tunjanganTransportasi;
    }

    public Pegawai(String idPegawai, String namaPegawai, int jarakRumahKeKantor, int masaKerjaPegawai,
                   int lembur, double gajihAwal) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.jarakRumahKeKantor = jarakRumahKeKantor;
        this.masaKerjaPegawai = masaKerjaPegawai;
        this.lembur = lembur;
        this.gajihAwal = gajihAwal;
        if (Math.floor(masaKerjaPegawai/12) >= 1) {
            this.gajihAkhir = (Math.floor(masaKerjaPegawai/12)*1000000) + this.gajihAwal;
        } else {
            this.gajihAkhir = this.gajihAwal;
        }
        if (lembur >= 3) {
            this.tunjanganLembur = 200000;
        } else {
            this.tunjanganLembur = 0;
        }
        if (jarakRumahKeKantor >= 3) {
            this.tunjanganTransportasi = 300000;
        } else {
            this.tunjanganTransportasi = 0;
        }
    }


    //     getter and setter
    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public int getJarakRumahKeKantor() {
        return jarakRumahKeKantor;
    }

    public void setJarakRumahKeKantor(int jarakRumahKeKantor) {
        this.jarakRumahKeKantor = jarakRumahKeKantor;
    }

    public int getMasaKerjaPegawai() {
        return masaKerjaPegawai;
    }

    public void setMasaKerjaPegawai(int masaKerjaPegawai) {
        this.masaKerjaPegawai = masaKerjaPegawai;
    }

    public double getGajihAwal() {
        return gajihAwal;
    }

    public void setGajihAwal(double gajihAwal) {
        this.gajihAwal = gajihAwal;
    }

    public double getGajihAkhir() {
        return gajihAkhir;
    }

    public void setGajihAkhir(double gajihAkhir) {
        this.gajihAkhir = gajihAkhir;
    }

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getTunjanganLembur() {
        return tunjanganLembur;
    }

    public void setTunjanganLembur(double tunjanganLembur) {
        this.tunjanganLembur = tunjanganLembur;
    }

    public double getTunjanganTransportasi() {
        return tunjanganTransportasi;
    }

    public void setTunjanganTransportasi(double tunjanganTransportasi) {
        this.tunjanganTransportasi = tunjanganTransportasi;
    }

    //    behaviour method
    public boolean cutiTahunan(){
        return false;
    }

    public boolean absenPegawai(){
        return false;
    }

    public boolean bonusTugasKeluarKota(){
        return false;
    }

    public boolean create() {
        String insertSql = "INSERT INTO pegawai VALUES('"+ idPegawai +"', '"+ namaPegawai +"', " +
                "'"+ jarakRumahKeKantor +"', '"+ masaKerjaPegawai +"', '"+ lembur +"', '"+ gajihAwal +"', " +
                "'"+ gajihAkhir +"', '"+ tunjanganLembur +"', '"+ tunjanganTransportasi +"')";
        System.out.println(insertSql);
        boolean berhasil = true;
        if (berhasil) {
            return true;
        } else {
            return false;
        }
    }

    public void read() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Nama Pegawai : " + namaPegawai);
        System.out.println("Jarak Rumah Ke Kantor Dalam Radius Kilometer : " + jarakRumahKeKantor + " KM");
        System.out.println("Masa Kerja Pegawai : " + masaKerjaPegawai + " Bulan");
        System.out.println("Jumlah Lembur : " + lembur);
        System.out.println("Gajih Awal : Rp" + gajihAwal);
        System.out.println("Gajih Akhir : Rp" + gajihAkhir);
        System.out.println("Tunjangan Lembur : Rp" + tunjanganLembur);
        System.out.println("Tunjangan Transportasi : Rp" + tunjanganTransportasi);
        System.out.println("-----------------------------------------------------------------------------------");

    }

    public boolean update() {
        String insertSql = "UPDATE pegawai SET idPegawai='"+ idPegawai +"', namaPegawai='"+ namaPegawai +"'," +
                " jarakRumahKeKantor='"+ jarakRumahKeKantor +"', masaKerjaPegawai='"+ masaKerjaPegawai +"'," +
                " lembur='"+ lembur +"', gajihAwal='"+ gajihAwal +"', gajihAkhir='"+ gajihAkhir +"', " +
                "tunjanganLembur='"+ tunjanganLembur +"', tunjanganTransportasi='"+ tunjanganTransportasi +"'" +
                " WHERE idPegawai="+ idPegawai;
        System.out.println(insertSql);
        boolean berhasil = true;
        if (berhasil) {
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(String idPegawaiDihapus) {
        String insertSql = "DELETE FROM pegawai WHERE idPegawai="+ idPegawaiDihapus;
        System.out.println(insertSql);
        boolean berhasil = true;
        if (berhasil) {
            return true;
        } else {
            return false;
        }
    }


}
