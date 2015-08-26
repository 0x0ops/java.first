/**
 * Created by Thync on 8/20/2015.
 */
public class Cau_15 {
    public static void main(String[] args){
        for(int i = 100000; i <= 999999; i++){
            int sau = i%1000;
            int truoc = i/1000;
            int dao = (sau%10)*100 + ((sau/10)%10)*10 +sau/100;
            if(dao == truoc){
                System.out.print(i+" ");
            }
        }
    }
}
