package lecture02;
import java.util.Scanner;
public class pra2_1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("名前を入力してください ： ");
        String name1 = scan.nextLine();
        System.out.print("学籍番号を入力してください ： ");
        int num = scan.nextInt();

        System.out.printf("氏名：%s , 学籍番号：b%d",name1,num);
    }
}
