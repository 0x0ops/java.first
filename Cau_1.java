/**
 * Created by Thync on 8/18/2015.
 */
import java.util.Scanner;

public class Cau_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Cao: ");
        int cao = scan.nextInt();
        System.out.print("Rong: ");
        int rong = scan.nextInt();
        for(int i = 1; i <= cao; i++){
            for(int j = 1; j <= rong; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
