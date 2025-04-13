package soal2;
class Member {
    String noMember;
    String nama;
    String alamat;
    String tipeMember;
    int lamaTahun;

    Member next;

    public Member(String noMember, String nama, String alamat, String tipeMember, int lamaTahun) {
        this.noMember = noMember;
        this.nama = nama;
        this.alamat = alamat;
        this.tipeMember = tipeMember;
        this.lamaTahun = lamaTahun;
        this.next = null;
    }
}
