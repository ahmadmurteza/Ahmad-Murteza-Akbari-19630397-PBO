package model;

public class Main {
    public static void main(String[] args) {
//        instance Pegawai
        Pegawai ahmad = new Pegawai();
        Pegawai murteza = new Pegawai("P0000011", "murteza", 4,
                39, 5, 2000000);
        Pegawai akbari = new Pegawai("P0000022", "akbari", 2,
                12, 5, 2000000, 3000000, 200000,
                300000);


//        object Pegawai Murteza
        murteza.read();
        murteza.totalGajih();
        murteza.bonusKeluarKota(murteza.getGajihAkhir());
        murteza.uangTransportKeluarKota(20);
        if (murteza.absenPegawai(true)) {
            System.out.println("++++ Karyawan Hadir ++++");
        } else {
            System.out.println("---- Karyawan Tidak Hadir ----");
        }

        if (murteza.create()) {
            System.out.println("++++ Data Berhasil Ditambahkan ++++");
        } else {
            System.out.println("---- Data Gagal Ditambahkan ----");
        }

        if (murteza.update()) {
            System.out.println("++++ Data Berhasil Diupdate ++++");
        } else {
            System.out.println("---- Data Gagal Diupdates ----");
        }

        if (murteza.delete(murteza.getIdPegawai())) {
            System.out.println("++++ Data Berhasil Dihapus ++++");
        } else {
            System.out.println("---- Data Gagal Dihapus ----");
        }


        System.out.println("*************************************************************************************" +
                "********************************************************************");
//        object pegawai akbari
        akbari.read();

        if (akbari.create()) {
            System.out.println("++++ Data Berhasil Ditambahkan ++++");
        } else {
            System.out.println("---- Data Gagal Ditambahkan ----");
        }

        if (akbari.update()) {
            System.out.println("++++ Data Berhasil Diupdate ++++");
        } else {
            System.out.println("---- Data Gagal Diupdates ----");
        }

        if (akbari.delete(akbari.getIdPegawai())) {
            System.out.println("++++ Data Berhasil Dihapus ++++");
        } else {
            System.out.println("---- Data Gagal Dihapus ----");
        }

        System.out.println("*************************************************************************************" +
                "********************************************************************");
//        object pegawai ahmad
        ahmad.read();

        if (ahmad.create()) {
            System.out.println("++++ Data Berhasil Ditambahkan ++++");
        } else {
            System.out.println("---- Data Gagal Ditambahkan ----");
        }

        if (ahmad.update()) {
            System.out.println("++++ Data Berhasil Diupdate ++++");
        } else {
            System.out.println("---- Data Gagal Diupdates ----");
        }

        if (ahmad.delete(ahmad.getIdPegawai())) {
            System.out.println("++++ Data Berhasil Dihapus ++++");
        } else {
            System.out.println("---- Data Gagal Dihapus ----");
        }
    }
}
