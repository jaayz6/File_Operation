import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        File folder = new File("data"); 

        if (folder.exists() && folder.isDirectory()) {
            File[] daftarFile = folder.listFiles();

            for (File file : daftarFile) {
                if (file.isFile()) {
                    boolean hasil = file.delete();
                    System.out.println((hasil ? "Berhasil" : "Gagal") + " menghapus file: " + file.getName());
                }
            }

            boolean folderTerhapus = folder.delete();
            System.out.println((folderTerhapus ? "Berhasil" : "Gagal") + " menghapus direktori: " + folder.getName());
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan folder.");
        }
    }
}
