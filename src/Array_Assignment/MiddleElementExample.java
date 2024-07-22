//Pt 2

package Array_Assignment;

public class MiddleElementExample {
    public static void main(String[] args) {

// Define the integer array
        int[] arr = {13, 5, 7, 68, 2};

// this is the formula to find the index of the middle number
        int middleIndex = arr.length / 2;

//below is how we retrieve the middle array
        int middleElement = arr[middleIndex];

//below we will use a System print out to see our results
        System.out.println("the middle index is   " +  middleElement);
    }
}

