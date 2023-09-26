public class teststudent {

    public static void main(String[] args) {

        student2 nama = new student2();
        student2 kredit = new student2();
        student2 IPK = new student2();
        student2 poinKualitas = new student2();

        nama.setNama("Efika Widiyanti");
        kredit.setKredit("A");
        IPK.setIPK(4);
        poinKualitas.setPointKualitas(90);

        System.out.println("Nama Anda : " + nama.getNama());
        System.out.println("Kredit nilai anda : " + kredit.getKredit());
        System.out.println("IPK : " + IPK.getIPK());
        System.out.println("Poin Kualitas : " + poinKualitas.getPointKualitas());

    }

}
