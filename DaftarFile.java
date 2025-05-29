import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        File direktori = new File("."); // "." = direktori saat ini

        if (direktori.exists() && direktori.isDirectory()) {
            File[] isi = direktori.listFiles(); // ambil semua isi direktori

            System.out.println("Daftar file:");
            for (File file : isi) {
                if (file.isFile()) { // hanya tampilkan file (bukan folder)
                    System.out.println("- " + file.getName());
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
