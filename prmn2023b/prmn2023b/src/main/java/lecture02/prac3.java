package lecture02;
import java.util.Scanner;
public class prac3 {
    public static void main(String[] args){

        Reference ref = new Reference();
        Scanner scan = new Scanner(System.in);

        String[][] gakuseki = ref.data();

        System.out.println("学籍番号を入力してください。 ： ");
        String gaku1 = scan.nextLine();

        for(int i = 0 ; i < 5 ; i++){
            if(gakuseki[i][0].equals(gaku1)){
                System.out.println("パスワードを入力してください。 ： ");
                String gaku2 = scan.nextLine();
                for(int j = 0 ; j < 5 ; j++){
                    if(gakuseki[j][1].equals(gaku2)){
                        System.out.println("ログイン完了。 ");
                        System.exit(0);
                    }
                }
                System.out.println("不正なアクセス");
                System.exit(0);
            }
            System.out.println("error!! ");
            System.exit(0);

        }
    }
}
