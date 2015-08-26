/**
 * Created by Thync on 8/19/2015.
 */
import java.util.Scanner;

public class Cau_11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int i = 2;
        while(n > 1){
            if(n%i == 0){
                System.out.print(i);
                n = n/i;
                if(n >1 ){
                    System.out.print("x");
                }
            }
            else{
                i++;
            }
        }
    }
}
