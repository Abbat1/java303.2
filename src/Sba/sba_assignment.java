package Sba;

public class sba_assignment {
    public static void main(String[] args) {
        int number =598798906;
        int sum = getDigitsSum(number);
        System.out.println("The sum of these all digits is : " + sum);
    }

    public static int getDigitsSum(int largeNumber) {
        int sum = 0;

        // this line below is where we used a loop, to loop through numbers until largeNumber becomes 0.
        while (largeNumber > 0) {
            // use the last number of "largeNumber" and add it to sum
            sum += largeNumber % 10;

            // Remove the last digit from largeNumber
            largeNumber = (int) Math.floor(largeNumber / 10);
        }

        return sum;
    }
}
