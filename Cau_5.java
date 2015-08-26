/**
 * Created by Thync on 8/18/2015.
 */
import java.util.Scanner;
import java.util.Random;

public class Cau_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap 10 < n < 99: ");
        int n = scan.nextInt();
        Random ran = new Random();
        int random;
        int i = 0;
        do{
            random = 10 + ran.nextInt(99-10+1);
            System.out.println("Buoc "+ i+": "+random);
            i++;
        }while(random != n);

    }
}
