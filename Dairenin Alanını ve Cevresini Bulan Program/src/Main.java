import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int r ;
        double alan , pi =3.14 , a;
        Scanner input =new Scanner(System.in) ;
        System.out.print("Yarıcapı giriniz  : ");

        r = input.nextInt();

        System.out.print("Aciyi Giriniz  : ");


        a = input.nextDouble() ;

        alan = pi * r * r * a / 360 ;

        System.out.println("Acili Bölge Alanı  :" + alan);

    }
}
