import java.util.*;

class TenByTen{
    static ArrayList<Integer> block1 = new ArrayList<Integer>();
    static ArrayList<Integer> block2 = new ArrayList<Integer>();

    public static void main(String [] args){
        // We make this final since we don't want our expected output to avoid unwanted changes
        final int expectedOutput = 7;
        int givenArr1[][] = {
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {2, 4, 6, 8, 10, 1, 2, 3, 4, 5},
            {2, 4, 8, 16, 32, 1, 2, 3, 4, 5},
            {1, 1, 2, 3, 5, 1, 2, 3, 4, 5},
            {7, 2, 1, 2, 1, 1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
        };
        int givenArr2[][] = {
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {2, 4, 6, 8, 10, 1, 2, 3, 4, 5},
            {2, 4, 8, 16, 32, 1, 2, 3, 4, 5},
            {1, 1, 2, 3, 5, 1, 2, 3, 4, 5},
            {1, 2, 1, 2, 1, 1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
            {0, 2, 3, 4, 5, 1, 2, 3, 4, 5},
        };
    
        arrConverter(givenArr1, block1, expectedOutput);
        arrConverter(givenArr2, block2, expectedOutput);
        
        int total = 0;

        System.out.println("All possible combinations are the following!");
        for(int i = 0; i < block1.size(); i++){
            for(int j = 0; j < block2.size(); j++){
                if((block1.get(i) + block2.get(j)) == 7){
                    System.out.println("Combination: " + block1.get(i) + " " + block2.get(j));
                    total += 1;
                }
            }
            // Print new line
            // You can also use System.out.print("\n") 
            System.out.println();
        }
        System.out.println("Total number of combination: " + total);
    }

    public static void arrConverter(int [][]arr, ArrayList destination, int expectedOutput){
        // Lets convert the given array which is 10d array to 1d array
        // Lets also do some basic validation eg. 
        // Check if there is duplicates then remove them
        // If there is a value greater than the output that we want then we would remove them aswell
        // Since we know already that this would be a 10 x 10 array lets put the condition of loop into 10 for now
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j ++){
                // If the value is less than or equal with expected output since we want the possible combination 
                // that would result to the expected output, so having a value higher than that would be meaningless right? and
                // If the value still doesn't exist in the ArrayList since we want to reduce redundancy
                if(arr[i][j] <= expectedOutput && !destination.contains(arr[i][j])){
                    destination.add(arr[i][j]);
                }
            }
        }
    }
    
}