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


//        object Pegawai
        murteza.read();
        if (murteza.create()) {
            System.out.println("++++ Data Berhasil Ditambahkan ++++");
        } else {
            System.out.println("---- Data Gagal Ditambahkan ----");
        }

        akbari.read();
        if (akbari.create()) {
            System.out.println("++++ Data Berhasil Ditambahkan ++++");
        } else {
            System.out.println("---- Data Gagal Ditambahkan ----");
        }

        ahmad.read();
        if (ahmad.create()) {
            System.out.println("++++ Data Berhasil Ditambahkan ++++");
        } else {
            System.out.println("---- Data Gagal Ditambahkan ----");
        }
    }
}
