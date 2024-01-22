import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calculator {

    public static void printResults(Long startTime, List<Long> primeNumbers) {

        long number = primeNumbers.size();

        System.out.println("------------------");

        int breakPoint = 0;
        for (long pn : primeNumbers) {
            String deliminator = "";
            if (!Objects.equals(pn, primeNumbers.get(primeNumbers.size() - 1))) {
                deliminator = ", ";
            }
            System.out.print(pn + deliminator);
            breakPoint++;
            if (breakPoint >= 15) {
                System.out.println();
                breakPoint = 0;
            }

        }

        System.out.println();
        System.out.println("------------------");
        System.out.println("Count of Prime-Numbers: " + number);
        System.out.println("Duration of calculation: " +
                getDurationInSeconds(System.currentTimeMillis(), startTime) +
                " seconds");
        System.out.println("------------------");
    }

    public static List<Long> getPrimeNumbers(long start, long limit) {
        StringBuilder string = new StringBuilder();
        List<Long> primeNumbers = new ArrayList<>();
        for (long i = start; i <= limit; i++) {
            int z = 0;
            for (long y = 1L; y <= i; y++) {
                if (i % y == 0) {
                    z++;
                }
            }
            if (z <= 2 && i != 1) {
                primeNumbers.add(i);
            }
            System.out.print(string);
        }

        return primeNumbers;
    }

    public static double getDurationInSeconds(Long stopTime, Long startTime) {
        return (double) (stopTime - startTime) / 1000;
    }


}
