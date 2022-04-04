package marketProje;

import java.util.Scanner;

public class Depo {

    static Scanner scan = new Scanner(System.in);
    static double odenecekUcret = 0;
    static double toplamOdenecekUcret = 0;

    double domates = 2.1;
    double patates = 2.1;
    double biber = 1.5;
    double sogan = 2.3;
    double havuc = 3.1;
    double elma = 1.2;
    double muz = 1.9;
    double cilek = 6.1;
    double kavun = 4.3;
    double uzum = 2.7;
    double limon = 0.5;

    Depo() {
    }


    Depo(int tercih) {

        System.out.println("lütfen seçtiğiniz üründen  kaç kilo almak istediğinizi belirtiniz.");

        double kilo = scan.nextDouble();

        if (tercih == 1) {odenecekUcret = domates*kilo;System.out.println("Sepete eklediğiniz dometesin fiyatı:" + odenecekUcret);}
        if (tercih == 2) {odenecekUcret = biber*kilo;System.out.println("Sepete eklediğiniz biberin fiyatı:" + odenecekUcret);}
        if (tercih == 3) {odenecekUcret = sogan*kilo;System.out.println("Sepete eklediğiniz soganin fiyatı:" + odenecekUcret);}
        if (tercih == 4) {odenecekUcret = havuc*kilo;System.out.println("Sepete eklediğiniz havucun fiyatı:" + odenecekUcret);}
        if (tercih == 5) {odenecekUcret = elma*kilo;System.out.println("Sepete eklediğiniz elmanın fiyatı:" + odenecekUcret);}
        if (tercih == 6) {odenecekUcret = muz*kilo;System.out.println("Sepete eklediğiniz muzun fiyatı:" + odenecekUcret);}
        if (tercih == 7) {odenecekUcret = cilek*kilo;System.out.println("Sepete eklediğiniz cilegin fiyatı:" + odenecekUcret);}
        if (tercih == 8) {odenecekUcret = kavun*kilo;System.out.println("Sepete eklediğiniz kavunun fiyatı:" + odenecekUcret);}
        if (tercih == 9) {odenecekUcret = uzum*kilo;System.out.println("Sepete eklediğiniz uzumun fiyatı:" + odenecekUcret);}
        if (tercih == 10) {odenecekUcret = limon*kilo;System.out.println("Sepete eklediğiniz limonun fiyatı:" + odenecekUcret);}

        toplamOdenecekUcret += odenecekUcret;

        System.out.println("Alışverişe devam etmek istiyorsanız 1'e basınız.Alışverisi sonlandırmak için 2'e basınız.");

        int tercih2 = scan.nextInt();


        if (tercih2 == 1) {
            System.out.println("Lütfen almak istediğiniz ürünün numarasını seçiniz.\n1.Domates\n2.Patetes\n3.Biber\n4.Soğan\n5.Havuç\n6.Elma\n7.Muz\n8.Çilek\n9.Kavun\n10.Üzüm\n11.Limon");
            int tercih3 = scan.nextInt();
            new Depo(tercih3);}

        if(tercih2==2){System.out.println("Lütfen ödeme yapınız");

            double tercih4=scan.nextInt();

            if(tercih4>toplamOdenecekUcret){System.out.println("Para ustunuz:"+(tercih4-odenecekUcret));}
            else if(tercih4==toplamOdenecekUcret){System.out.println("Teşekkürler");}
            else {System.out.println("Yetersiz bakiye.");}}
    }

}
