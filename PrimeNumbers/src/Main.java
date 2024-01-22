import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER:");
        long start = sc.nextLong();

        System.out.println("ENTER LAST NUMBER:");
        long limit = sc.nextLong();

        List<Long> primeNumbers = Calculator.getPrimeNumbers(start, limit);

        Calculator.printResults(startTime, primeNumbers);
    }

}







