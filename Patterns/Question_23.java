/*
Question 23 :
N = 5
        1 
      1 1 1
    1 1 1 1 1 
  1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1


 */

public class Question_23 {
    public static void main(String[] args) {
        int N = 5;
        for(int i = 1; i <= N; i++) {
            for(int space = N-i; space >= 1; space--) {
                System.out.print("  ");
            }
            for(int stars = 1; stars <= 2*i - 1; stars++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}