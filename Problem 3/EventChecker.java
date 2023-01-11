import java.util.*;

class EventChecker {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        final int yearInvented = 1896;
        final int heldEvery = 4;
        System.out.println("What year?");
        boolean condition = true;
        int yearGiven = 0;
        do{
            try{
                yearGiven = Integer.parseInt(scan.nextLine());
                condition = false;
                if(yearGiven < yearInvented){
                    System.out.println("The event doesn't exist yet at that time so please try another date instead!");
                    condition = true;
                }
            } catch(NumberFormatException e) {
                System.out.println("Wrong Input Please Try again!");
            }   
        }while(condition);
        if((yearGiven - yearInvented) % 4 == 0){
            System.out.println("Currently ongoing on the year: " + yearGiven);
        } else {
            System.out.println("Currently not ongoing on the year: " + yearGiven);
        }
    }    
}
