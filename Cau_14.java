/**
 * Created by Thync on 8/19/2015.
 */
import java.util.Scanner;

public class Cau_14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = scan.nextInt();
        }while(n < 2 || n > 90);
        int[] a = new int[90];
        a[0] = 0;
        a[1] = 1;
        System.out.print(a[1]+" ");
        for(int i = 2; i <= n; i++){
            a[i] = a[i-1] + a[i-2];
            System.out.print(a[i]+" ");
        }
    }
}
