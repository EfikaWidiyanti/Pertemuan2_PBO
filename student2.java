public class student2 {

    // Membuat variable
    private String nama;
    private String kredit;
    private double IPK;
    private double pointkualitas;

    public student2() {
        // Konstruktor default
    }

    public student2(String n, String k, double ipk, double pk) {
        nama = n;
        kredit = k;
        IPK = ipk;
        pointkualitas = pk;
    }

    // Setter untuk mengatur nama
    public void setNama(String n) {
        nama = n;
    }

    // Setter untuk mengatur kredit berdasarkan nilai numerik
    public void setKredit(String k) {
        kredit = k;
    }

    // Setter untuk mengatur IPK
    public void setIPK(double ipk) {
        IPK = ipk;
    }

    // Setter untuk mengatur poin kualitas
    public void setPointKualitas(double pk) {
        pointkualitas = pk;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getKredit() {
        return kredit;
    }

    public double getIPK() {
        return IPK;
    }

    public double getPointKualitas() {
        return pointkualitas;
    }

}
