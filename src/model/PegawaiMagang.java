package model;

public class PegawaiMagang extends Pegawai{
//        attribute
        private String namaPegawaiMagang;
        private int jarakKeKantor;
        private int lemburMagang;

//    getter and setter
    public String getNamaPegawaiMagang() {
        return namaPegawaiMagang;
    }

    public void setNamaPegawaiMagang(String namaPegawaiMagang) {
        this.namaPegawaiMagang = namaPegawaiMagang;
    }

    public int getJarakKeKantor() {
        return jarakKeKantor;
    }

    public void setJarakKeKantor(int jarakKeKantor) {
        this.jarakKeKantor = jarakKeKantor;
    }

    public int getLemburMagang() {
        return lemburMagang;
    }

    public void setLemburMagang(int lemburMagang) {
        this.lemburMagang = lemburMagang;
    }

//    behaviour method
    public void totalTunjangan(int lemburMagang, int jarakKeKantor){
        double totalTunjangan = (lemburMagang * 100000) + (jarakKeKantor * 30000);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Total Tunjangan : Rp"+ totalTunjangan);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public void BonusAnakMagangKeluarKota(int hari) {
        double total = 300000 * hari;
        System.out.println("Bonus Keluar Kota = " + total);
    }

    public boolean create() {
        String insertSql = "INSERT INTO pegawaiMagang VALUES('"+ namaPegawaiMagang +"', '"+ jarakKeKantor +"'," +
                " '"+ lemburMagang +"')";
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
        System.out.println("ID Pegawai Magang : " + namaPegawaiMagang);
        System.out.println("Tunjangan Transportasi Pegawai Magang : " + namaPegawaiMagang);
        System.out.println("Tunjangan Lembur Pegawai Magang : " + lemburMagang);
        System.out.println("-----------------------------------------------------------------------------------");

    }

    public boolean update() {
        String insertSql = "UPDATE pegawaiMagang SET namaPegawaiMagang='"+ namaPegawaiMagang +"', jarakKeKantor='"+ jarakKeKantor +"', lemburMagang='"+ lemburMagang +"',";
        System.out.println(insertSql);
        boolean berhasil = true;
        if (berhasil) {
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(String namaPegawaiMagangDihapus) {
        String insertSql = "DELETE FROM pegawaiMagang WHERE namaPegawaiMagang="+ namaPegawaiMagangDihapus;
        System.out.println(insertSql);
        boolean berhasil = true;
        if (berhasil) {
            return true;
        } else {
            return false;
        }
    }

//    override

    @Override
    public void uangTransportKeluarKota(int jarak) {
        super.uangTransportKeluarKota(jarak);
    }

    @Override
    public boolean absenPegawai(boolean kehadiran) {
        return super.absenPegawai(kehadiran);
    }
}
