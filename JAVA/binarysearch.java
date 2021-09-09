import java.util.Arrays;
import java.util.Scanner;

public class binarysearch{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String input;
        
        System.out.print("Angka = ");
        input = in.next();
        
        String[] angka = {"1","2", "3", "4", "5", "6", "7", "8","9"};

        int x = Arrays.binarySearch(angka, input);
        if(x < 0){
            System.out.println("Angka tidak ada");
        }else { 
            System.out.println("Angka berada di urutan " + (x+1));
            in.close();
        }
    }
}
