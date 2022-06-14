import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       /* for (int num = 0; num <= n; num++) {
            System.out.println(num + " ");
        }
        */
        int num=1;
        while(num<=5){
            System.out.println(num);
            num+=1;
        }
    }
}
