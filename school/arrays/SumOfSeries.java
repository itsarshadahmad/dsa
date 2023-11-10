package school.arrays;

/*

Q: Sum Of Series
https://practice.geeksforgeeks.org/problems/sum-of-series2811/1

Input:
n = 5
output: 15
Explanation: For n = 5, sum will be 15.
1 + 2 + 3 + 4 + 5 = 15.

*/

public class SumOfSeries {
    long seriesSum(int n) {
        long result = (long) n * (n + 1) / 2;
        return result;
    }

    public static void main(String[] args) {
        SumOfSeries series = new SumOfSeries();
        long result = series.seriesSum(15);
        System.out.println(result);
    }
}
