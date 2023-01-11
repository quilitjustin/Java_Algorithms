import java.util.*;

class IntegerToBinary {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Your integer?");
        boolean condition = true;
        int intGiven = 0;
        do{
            try{
                intGiven = Integer.parseInt(scan.nextLine());
                // If the input given can't be converted to integer then it would not reach this line
                // So if it reach this line, then it means that the user provided us with the correct input
                condition = false;
            } catch (NumberFormatException e){
                System.out.println("Wrong input please try again!");
            } 
        }while(condition);
        convert(intGiven);
    }
    // To be fixed
    public static void convert(int n){
        // If integer is 0 or below then return nothing
        if(n == 1){
            System.out.println("1");
            return;
        }
        // Check if divisible by 2
        if(n % 2 == 0){
            System.out.print("1");
        } else {
            System.out.print("0");
        }
        // divide n with 2
        n /= 2;
        convert(n);
    }
}
