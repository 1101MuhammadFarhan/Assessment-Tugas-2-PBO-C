import java.util.Scanner;

public class bilprima {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Angka: ");

        int angka, cek=0;
        angka=in.nextInt();

        for (int i=2; i<=angka; i++){
            if (angka%i==0){
                cek++;
            } 
        }
        
        if (cek==1){
            System.out.println(angka+" adalah angka prima");
        }else {
            System.out.println(angka+" bukan angka prima");
            in.close();
        }  
   }
}