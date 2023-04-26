package src.basics.introductory_questions;

/*
For Loop- primeCheck - Java:
https://practice.geeksforgeeks.org/problems/for-loop-primecheck-java/1
 */

public class PrimeCheck {
    static void isPrime(int n) {
        boolean isPrimeNumber = true;

        if (n == 1) {
            isPrimeNumber = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        System.out.println(isPrimeNumber ? "Yes" : "No");
    }

    public static void main(String[] args) {
        isPrime(1);
        isPrime(11);
    }
}
