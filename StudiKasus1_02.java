import java.util.Scanner;

public class StudiKasus1_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int hargaPerCup=18000;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian;
        int kurang;
        
        System.out.print("Jumlah cup yang di beli" );
        int jumlahCup= sc.nextInt();
        
        System.out.print("Uang yang harus dibayar");
        int uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if( totalHarga >=100000){
            diskon = totalHarga * 10/100;
        }

        totalBayar = totalHarga - diskon;

        System.out.print("Total harga Rp." +totalHarga);
        System.out.println("Diskon" +diskon);
        System.out.println("Total bayar Rp." +totalBayar);

        if(uangBayar >= totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian Rp." + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, Kurang Rp." +kurang);
        }
    }
}
