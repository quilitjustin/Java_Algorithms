import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        // How much the salary
        int salary = 500;
        int totalSalary = 0;
        // How much the salary would increace
        final int salaryIncrease = 50;
        // The day the salary would increase
        final int dSalaryIncrease = 50;
        System.out.println("How many days?");
        boolean condition = false;
        // Number of Days
        int nDays = 0;
        // Keep asking the user if the condition is still true
        // True == input is can't be converted to integer ex. String or Special chars
        do{
            try{
                nDays = Integer.parseInt(scan.nextLine()); 
                if(nDays == 0){
                    System.exit(0);
                }
                condition = false;
            }catch(NumberFormatException e){
                System.out.println("Wrong Input Please Try again!");
            }
        }while(condition);
        for(int i = 0; i < nDays; i++){
            // int i, would represent the current day
            // if i == 50 (dSalaryIncrease), then the employee is entitled for salary increase 
            // Since we started at day 0, i == 49 would be equivalent to 50th day 
            if(i == (dSalaryIncrease - 1)){
                // from 500 salary + 50 = 550; and so on ...
                salary += salaryIncrease;
            }
            totalSalary += salary;
        }
        System.out.println("Your total salary is: " + totalSalary);
    }

}