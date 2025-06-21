package FinancialForecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValueRecursive(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Iterative method to calculate future value (for optimization)
    public static double calculateFutureValueIterative(double presentValue, double growthRate, int years) {
        double result = presentValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 10000;    // Initial amount
        double growthRate = 0.08;       // 8% annual growth
        int years = 5;                  // Number of years to forecast

        double futureRecursive = calculateFutureValueRecursive(presentValue, growthRate, years);
        double futureIterative = calculateFutureValueIterative(presentValue, growthRate, years);

        System.out.printf("Future Value (Recursive) after %d years: %.2f\n", years, futureRecursive);
        System.out.printf("Future Value (Iterative) after %d years: %.2f\n", years, futureIterative);
    }
}
