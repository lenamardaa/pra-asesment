package soal1;
import java.util.LinkedList;
import java.util.Queue;

class Klinik {
    Queue<Pasien> antrian = new LinkedList<>();

    public void ambilNomor(String nomor, String nama, String namaDokter, String jenisDokter) {
        Pasien pasien = new Pasien(nomor, nama, namaDokter, jenisDokter);
        System.out.println("Anda adalah pasien " + jenisDokter);
        if (!antrian.isEmpty()) {
            System.out.println("Anda menunggu " + antrian.size() + " orang lagi");
        }
        antrian.add(pasien);
    }

    public void panggilanKlinik() {
        if (!antrian.isEmpty()) {
            Pasien dipanggil = antrian.poll();
            System.out.println("Nomor " + dipanggil.nomor + " dengan nama " + dipanggil.nama +
                    " untuk dokter " + dipanggil.namaDokter + " , pasien " + dipanggil.jenisDokter +
                    " silahkan ke ruang periksa");
        } else {
            System.out.println("Tidak ada pasien dalam antrian");
        }
    }

    public void hapusSemua() {
        antrian.clear();
        System.out.println("Seluruh data antrian telah dihapus.");
    }
}
