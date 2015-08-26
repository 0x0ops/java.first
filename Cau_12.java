/**
 * Created by Thync on 8/19/2015.
 */
import java.util.Scanner;

public class Cau_12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        for (int i = 2; i < n; i++) {
            int check = 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0){
                    check = 0;
                    break;
                }
            }
            if(check == 1) {
                System.out.print(i+" ");
            }
        }
    }
}
