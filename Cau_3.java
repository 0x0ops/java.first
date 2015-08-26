/**
 * Created by Thync on 8/18/2015.
 */
import java.util.Scanner;

public class Cau_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Cao: ");
        int cao = scan.nextInt();
        for(int i = 0; i < cao; i++){
            for(int j = 1; j <= cao - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
