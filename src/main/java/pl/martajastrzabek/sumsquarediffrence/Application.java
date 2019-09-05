package pl.martajastrzabek.sumsquarediffrence;

import pl.martajastrzabek.sumsquaredifference.service.SumSquareDifferenceService;

public class Application {
    public static void main(String[] args) {
        SumSquareDifferenceService difference = new SumSquareDifferenceService();
        System.out.println("Difference is: " + difference.calculateDifference(10));
    }
}
