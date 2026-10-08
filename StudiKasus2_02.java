import java.util.Scanner;

public class StudiKasus2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();

        String alasan = "";

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                alasan = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
            }    else {
                System.out.print("Peringkat : ");
                int peringkat = sc.nextInt();

                if (peringkat <= 3) {
                    alasan = "Selamat! Dana penghargaan diberikan.";
                } else {
                    alasan = "Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
                }
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print(" Masukkan jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                alasan = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
            } else {
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
                int statusPKM = sc.nextInt();

                if (statusPKM == 1) {
                    alasan = "Selamat! Dana penghargaan diberikan.";
                } else {
                    alasan = "PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
                }
            }

        } else {
            alasan = "Jenis kegiatan Lainnya tidak memperoleh dana penghargaan.";
        }

        System.out.println("\nStatus : " + alasan);

        
    }
}