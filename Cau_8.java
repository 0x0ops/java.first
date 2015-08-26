/**
 * Created by Thync on 8/18/2015.
 */
import java.util.Scanner;

public class Cau_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int dem = 0;
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                dem = dem + 2;
                System.out.println(i+" "+n/i);
            }
        }
        System.out.println("\nCo "+dem+" uoc so.");
    }
}
