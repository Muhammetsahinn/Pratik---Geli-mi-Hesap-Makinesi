import java.util.Scanner;
public class main3 {
    static int sum(int a, int b){
        int result = a+b;
        System.out.println("toplama islemi sonucu : " + result);
        return result;
    }
    static int cikar(int a, int b){
        int result = a-b;
        System.out.println("cıkarma islemi sonucu : " + result);
        return result;
    }
    static int carp(int a, int b){
        int result=a*b;
        System.out.println("carp islemi sonucu : " + result);
        return result;
    }
    static int bolme(int a, int b){
        if(b==0){
            System.out.println("b sayisini sifirdan farkli bir rakam giriniz!");
            return 0;
        }
        int result = a/b;
        System.out.println("bolme islemi sonucu : " + result);
        return result;
    }
    static int uslu(int a, int b){
        int result=1;
        for(int i=1; i<=b; i++){
           result*=a;
        }
        System.out.println("us alma islemi sonucu : " + result);
        return result;
    }
    static int mod(int a,int b){
        int result=a%b;
        System.out.println("sayinin modu : " + result);
        return result;
    }
    static void dik(int a, int b){
        System.out.println("Cevresi : " + (2*(a+b)));
        System.out.println("Alani : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama islemi\n"
        +"2- Cikarma islemi\n"
        +"3- Carpma islemi\n"
        +"4- Bolme islemi\n"
        +"5- Uslu Sayi Hesaplama\n"
        +"6- Mod Alma\n"
        +"7- Dikdortgen Alan ve Cevre Hesabi\n"
        +"0- Cikis yap\n";

        System.out.print(menu);

        while(true){

            System.out.print("bir islem seciniz : ");
            select = scan.nextByte();

            if ( select == 0){
                break;
            }
            System.out.print("ilk sayiyi giriniz : ");
            int a = scan.nextInt();
            System.out.print("ikinci sayiyi giriniz : ");
            int b = scan.nextInt();

            switch(select) {
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    cikar(a,b);
                    break;
                case 3:
                    carp(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    uslu(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    dik(a,b);
                    break;
                default:
                    System.out.print("Gecersiz islem girdiniz");

            }

        }
        System.out.print("Gule gule ");

    }

}