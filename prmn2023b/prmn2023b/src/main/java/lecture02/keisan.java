package lecture02;

public class keisan {

    int goukei(int[] t){
        int x = 0;
        for(int j = 0 ; j < 5 ; j++){
            x += t[j];
        }
        return x;
    }

    void hanbetsu(int x){
        if(x >= 100){
            System.out.println("great!!");
        }else if(x >= 50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
