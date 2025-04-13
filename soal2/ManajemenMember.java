package soal2;
class ManajemenMember {
    Member head;

    public void tambahMember(String no, String nama, String alamat, String tipe, int lama) {
        Member baru = new Member(no, nama, alamat, tipe, lama);
        if (head == null) {
            head = baru;
        } else {
            Member temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
        }
        System.out.println("Data member berhasil ditambahkan.");
    }

    public void hapusMember(String no) {
        if (head == null) {
            System.out.println("Data kosong.");
            return;
        }

        if (head.noMember.equals(no)) {
            head = head.next;
            System.out.println("Data member berhasil dihapus.");
            return;
        }

        Member temp = head;
        while (temp.next != null && !temp.next.noMember.equals(no)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Data member berhasil dihapus.");
        } else {
            System.out.println("Nomor member tidak ditemukan.");
        }
    }

    public void cariMember(String namaCari) {
        Member temp = head;
        boolean ditemukan = false;

        while (temp != null) {
            if (temp.nama.equalsIgnoreCase(namaCari)) {
                tampilkanData(temp);
                ditemukan = true;
            }
            temp = temp.next;
        }

        if (!ditemukan) {
            System.out.println("Member dengan nama '" + namaCari + "' tidak ditemukan.");
        }
    }

    public void tampilkanMemberLebihDariX(int tahun) {
        Member temp = head;
        boolean ditemukan = false;

        while (temp != null) {
            if (temp.lamaTahun > tahun) {
                tampilkanData(temp);
                ditemukan = true;
            }
            temp = temp.next;
        }

        if (!ditemukan) {
            System.out.println("Tidak ada member dengan langganan lebih dari " + tahun + " tahun.");
        }
    }

    public void tampilkanData(Member m) {
        System.out.println("No Member  : " + m.noMember);
        System.out.println("Nama       : " + m.nama);
        System.out.println("Alamat     : " + m.alamat);
        System.out.println("Tipe       : " + m.tipeMember);
        System.out.println("Lama Tahun : " + m.lamaTahun + " tahun");
        System.out.println("-----------------------------");
    }
}
