/*
E
D E
C D E
B C D E
A B C D E
*/

class Pattern18 {
    static void pattern(int N) {
        for (int i = 0; i < N; i++) {
            for (char ch = (char) (int) ('A' + N - 1 - i); ch <= (char) (int) ('A' + N - 1); ch++) {

                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}