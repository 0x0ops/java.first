/**
 * Created by Thync on 8/20/2015.
 */
import java.util.Scanner;

public class Cau_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap c: ");
        double c = scan.nextDouble();
        System.out.print("Nhap x: ");
        double x = scan.nextDouble();
        double s = 1;
        int n = 1;
        while( (double) Math.abs( (double) Math.pow(x,n) / GT(n) ) -c > 0 ) {
            s = s + (double)Math.pow(x,n) / GT(n);
            n++;
        }
        System.out.println("e^x = "+s);

    }

    public static long GT(int n) {
        long p = 1;
        if(n == 0 || n == 1) return 1;
        for(int i = 2; i <= n; i++) {
            p = p*i;
        }
        return p;

    }

}
