/**
 * Created by Thync on 8/20/2015.
 */
import java.util.Scanner;

public class Cau_16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.print("Nhap n: ");
        n = scan.nextInt();
        do {
            System.out.print("Nhap m: ");
            m = scan.nextInt();
        } while(n >= m);
        int dem = 0;
        for( int i = n; i < m; i++){
            if( i == (int) Math.sqrt(i)* (int) Math.sqrt(i)){
                dem ++;
                System.out.print(i+" ");
            }
        }
        System.out.print("\nCo: "+dem+" so chinh phuong");
    }
}
