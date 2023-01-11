import java.util.*;

class Square {
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      boolean condition = true;
      System.out.println("How many dimension of sqaure do you want?");
      int dimension = 0;
      do{
         try{
            dimension = Integer.parseInt(scan.nextLine());
            condition = false;
            if(dimension == 0){
               System.exit(0);
            }
         }catch(NumberFormatException e){
            System.out.println("Wrong Input Please Try again!");
         }
      }while(condition);
      for(int x = 0; x < dimension; x++){
         for(int y = 0; y < dimension; y++){
            System.out.print("* ");
         }
         // New line
         System.out.print("\n");
      }
   } 
}
