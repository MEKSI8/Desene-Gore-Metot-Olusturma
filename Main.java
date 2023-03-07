import java.util.Scanner;

public class Main {
    /*static int metot(int say, int say2, int say3){


        if (say3>say){
            return 1;
        }
        if (say2>0){
            System.out.print(say2+" ");
            say2-=5;
            int x=say2;
            say3=say2;
        }
        else {
            System.out.print(say3+" ");
            say3+=5;
        }

        return metot(say,say2,say3);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("SAYI GİRİN");
        int say= input.nextInt();
        metot(say,say,say);

    }*/
    static void metot(int a){
        System.out.print(a + " ");
        if (a<=0){
            return;
        }
        metot(a - 5);
        System.out.print(a + " ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girin : ");
        int n = input.nextInt();
        System.out.print("Çıktısı : ");

        metot(n);
    }
}