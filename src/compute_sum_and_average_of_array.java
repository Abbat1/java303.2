public class compute_sum_and_average_of_array {
    public static void main(String[] args) {
        int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
        int sum = 0;
        double average;
        //access all elements using for loop
        //add each element in sum
        for(int number: numbers) {
            sum+= number;
        }
        //get the total number of elements
        int arrayLength = numbers.length;

        //calculate the average
        //convert the average front int to double
        average = ((double)sum/ (double)arrayLength);

        System.out.println("Sum =" + sum);
        System.out.println("Average =" +average);
    }
}
