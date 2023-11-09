package lecture02;
import java.util.Scanner;
public class prac2 {
    public static void main(String[] args){

        int[] num = new int[5];
        Scanner scan = new Scanner(System.in);
        keisan kei = new keisan();

        for(int i = 0 ; i < 5 ; i++){
            System.out.printf("数字%dつ目 ： ",i);
            num[i] = scan.nextInt();
            System.out.println("");
        }

        int x = kei.goukei(num);

        System.out.printf("合計値：%d",x);
        System.out.println("");

        kei.hanbetsu(x);
    }
}
