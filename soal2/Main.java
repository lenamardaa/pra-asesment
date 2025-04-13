ppackage soal2;
public class Main {
    public static void main(String[] args) {
        ManajemenMember data = new ManajemenMember();

        data.tambahMember("M001", "Ani", "Palembang", "silver", 2);
        data.tambahMember("M002", "Budi", "Jakarta", "gold", 4);
        data.tambahMember("M003", "Cici", "Bandung", "platinum", 5);

        System.out.println("\nCari member dengan nama 'Budi':");
        data.cariMember("Budi");

        System.out.println("\nTampilkan member yang sudah lebih dari 3 tahun:");
        data.tampilkanMemberLebihDariX(3);

        System.out.println("\nHapus member dengan nomor M002:");
        data.hapusMember("M002");

        System.out.println("\nTampilkan member yang sudah lebih dari 3 tahun:");
        data.tampilkanMemberLebihDariX(3);
    }
}
