/**
 * Created by Thync on 8/18/2015.
 */
import java.util.Scanner;

public class Cau_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        if(n %2 ==1){
            long tongLe = (1+ n)*((n-1)/2+1)/2;
            System.out.println("\nTong = "+tongLe);
        }
        else{
            long tongChan = (2+n)*((n-2)/2+1)/2;
            System.out.println("\nTong = "+tongChan);
        }
    }
}
