/**
 * Created by Thync on 8/20/2015.
 */
import java.util.Scanner;

public class Cau_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap c: ");
        double c = scan.nextDouble();
        double s = 0;
        int n = 0;
        while( 1.0/(2*n+1)- c > 0 ){
            s = s + 4*((double) Math.pow(-1, n)*(1.0/(2*n+1)));
            n++;
        }
        System.out.print("Pi = "+s);
    }
}
