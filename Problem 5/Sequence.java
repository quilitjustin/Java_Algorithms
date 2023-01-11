import java.util.*;

class Sequence {
    public static void main(String [] args){
        int coverage = 5;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= coverage; j++){
                System.out.print(i + " ");
            }
            coverage -= 1;
            System.out.print("\n");
        }
    }
}
