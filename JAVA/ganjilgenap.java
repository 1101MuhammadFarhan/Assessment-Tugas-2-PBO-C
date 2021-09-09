import java.util.Scanner;

public class ganjilgenap
{
    public static void main(String args[])
    {
        int angka;
        System.out.println("Angka: ");
        
        Scanner in = new Scanner(System.in);
        angka = in.nextInt();
        
        if ( angka % 2 == 0 ){
        System.out.println(angka + " adalah angka genap");
        }else {
        System.out.println(angka + " adalah angka ganjil");
        in.close();
        }
    }
}