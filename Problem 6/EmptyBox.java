import java.util.*;

class EmptyBox {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of your box?");
        boolean condition = true;
        int boxSize = 0;

        do{
            try{
                boxSize = Integer.parseInt(scan.nextLine());
                condition = false;
            } catch (NumberFormatException e) { 
                System.out.println("Wrong input please try again!");
            }
        }while(condition);

        for(int i = 0; i < boxSize; i++){
            for(int j = 0; j < boxSize; j++){
                if(j == 0 || j == (boxSize - 1) || i == (boxSize - 1) || i == 0){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
