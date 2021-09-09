import java.util.Arrays;

public class dragonloowater  {
    public static void main(String[] args) {
               
        int[] H = { 2,1,8,5};
        Arrays.sort(H);
        int N = 0;

        int[] D = { 7,2 };
        Arrays.sort(D);
        int indeksD  = 0;
        for (int x : H ){
            if (indeksD < D.length){
                if (x >= D[indeksD]){
                    N += x;
                    indeksD++;
                }
            }
        }
        if (indeksD == D.length){
            System.out.println( N);
        } 
        else {
            System.out.println("Knight Fall");
        }
    }
}