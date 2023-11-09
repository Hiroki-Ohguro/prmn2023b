package lecture02;
import java.util.Scanner;
public class Gakuseki {

    void gakuseki(String num){

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください。 ： ");
        String gakuseki = scan.nextLine();

        if(num.equals(gakuseki)){
            System.out.println("complete!!");
        }else{
            System.out.println("error!!");
        }
    }
}
