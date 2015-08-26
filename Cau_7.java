/**
 * Created by Thync on 8/18/2015.
 */
import java.util.Scanner;

public class Cau_7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        double sum =0;
        for(int i = 1; i <= n; i++){
            sum = sum + 1.0/i;
        }
        System.out.print("S : "+sum);
    }
}
