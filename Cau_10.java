/**
 * Created by Thync on 8/19/2015.
 */
import java.util.Scanner;

public class Cau_10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        long n = scan.nextLong();
        long tong = 0;
        while (n > 0){
            tong = tong + n%10;
            n = n/10;
        }
        System.out.print("Tong = "+tong);
    }
}
