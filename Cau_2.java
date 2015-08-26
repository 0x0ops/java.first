/**
 * Created by Thync on 8/18/2015.
 */
import java.util.Scanner;

public class Cau_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Cao: ");
        int cao = scan.nextInt();
        System.out.print("Rong: ");
        int rong = scan.nextInt();
        for(int i = 1; i<= rong; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int j = 2; j < cao; j++){
            System.out.print("*");
            for(int k = 1; k <= rong-2; k++ ){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 1; i<= rong; i++){
            System.out.print("*");
        }
    }
}
