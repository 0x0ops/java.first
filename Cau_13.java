/**
 * Created by Thync on 8/19/2015.
 */
import  java.util.Scanner;

public class Cau_13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scan.nextInt();
        int dem = 0;
        int i = 2;
        while (dem < n){
            int check =1;
            for(int j =2; j <= Math.sqrt(i); j++ ){
                if(i%j == 0){
                    check = 0;
                    break;
                }
            }
            if(check == 1){
                dem++;
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
