import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            count += (list.get(i) % 2 != 0) ? 1 : 0;
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for(int item: list1) {
            for(int item2: list2) {
                if(item == item2) {return true;}
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            x.add(arr[i]);
        }
        return x;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
