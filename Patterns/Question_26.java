/*
Question 25 :
N = 5
                1
            1   2   3
        1   2   3   4   5
    1   2   3   4   5   6   7
1   2   3   4   5   6   7   8   9

 */

public class Question_26 {
    public static void main(String[] args) {
        int N = 5;
        
        for(int i = 1; i <= N; i++) {
            for(int space = N-i; space >= 1; space--) {
                System.out.print("\t");
            }
            for(int stars = 1; stars <= 2*i - 1; stars++) {
                System.out.print(stars + "\t");
            }
            System.out.println();
        }
    }
}