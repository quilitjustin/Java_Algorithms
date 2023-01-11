import java.util.*;

class Triangle {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        boolean condition = true;
        int triangleHeigth = 0;
        System.out.println("What is the height of your triangle?");
        do{
            try{
                triangleHeigth = Integer.parseInt(scan.nextLine());
                condition = false;
                if(triangleHeigth == 0){
                    System.exit(0);
                }
            } catch(NumberFormatException e) {
                System.out.println("Invalid Input Please Try again!");
            }
        }while(condition);
        for(int i = 0; i < triangleHeigth; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || (i == triangleHeigth - 1) || j == i){
                    System.out.print("+ ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.print("\n");
        }
    }
}
