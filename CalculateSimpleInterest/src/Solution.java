import java.util.Scanner;

class Solution {

    public static void main(String args[]) {

        // Write code here
        // Write code here
        Scanner scanner = new Scanner(System.in);
        int principle = scanner.nextInt();
        double rateOfInterest = scanner.nextDouble();
        int time = scanner.nextInt();
        int simpleInterest = (int) (principle * rateOfInterest * time) / 100;
        System.out.println(simpleInterest);

    }
} 