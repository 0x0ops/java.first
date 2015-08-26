/**
 * Created by Thync on 8/18/2015.
 */
import java.util.Scanner;

public class Cau_9 {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scan.nextInt();
        System.out.print("Nhap b: ");
        int b = scan.nextInt();
        for (int i = a; i <= b; i++) {
            for (int j = i+1; j <= b ; j++) {
                int x, y, z;
                int check = 1;
                y = i;
                z = j;
                while(z != 0){
                    x = y % z;
                    y = z;
                    z = x;
                }
                if(check == 1) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }

    }
}
