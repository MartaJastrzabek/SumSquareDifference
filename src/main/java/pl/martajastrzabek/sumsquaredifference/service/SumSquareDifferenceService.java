package pl.martajastrzabek.sumsquaredifference.service;

public class SumSquareDifferenceService {
    public int sumSquaresOfNumbers(int limit){
        int sum = 0;

        for (int i = 1; i <= limit; i++){
            int squareOfNumber = i*i;
            sum += squareOfNumber;
        }

        return sum;
    }

    public int squareOfNumbersSum(int limit){
        int sum = 0;

        for (int i = 1; i <= limit; i++){
            sum += i;
        }

        return sum * sum;
    }

    public int calculateDifference(int limit){
        return squareOfNumbersSum(limit) - sumSquaresOfNumbers(limit);
    }

}
