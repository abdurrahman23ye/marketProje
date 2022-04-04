package marketProje;

import java.util.Scanner;

public class Market {

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lütfen almak istediğiniz ürünün numarasını seçiniz.\n1.Domates\n2.Patetes\n3.Biber\n4.Soğan\n5.Havuç\n6.Elma\n7.Muz\n8.Çilek\n9.Kavun\n10.Üzüm\n11.Limon");
    //Kullanıcının yapabileceği hatalar çalışılmadı.

        int tercih1=scan.nextInt();

        Depo tercih=new Depo( tercih1);

        }



    }

