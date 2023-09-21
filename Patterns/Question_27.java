/*
Question 27 :
N = 5
                1
            1   2   1
        1   2   3   2   1
    1   2   3   4   3   2   1
1   2   3   4   5   4   3   2   1

 */

public class Question_27 {
    public static void main(String[] args) {
        int N = 5;
        
        for(int i = 1; i <= N; i++) {
            for(int space = N-i; space >= 1; space--) {
                System.out.print("\t");
            }
            int count = 1, rev = i-1;
            for(int stars = 1; stars <= 2*i - 1; stars++) {
                if(stars <= i) {
                    System.out.print(count + "\t");
                    count++;
                } else {
                    System.out.print(rev + "\t");
                    rev--;
                }
            }
            System.out.println();
        }
    }
}