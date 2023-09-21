/*
Question 24 :
N = 5
        1 
      2 2 2
    3 3 3 3 3 
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5

 */

public class Question_24 {
    public static void main(String[] args) {
        int N = 5;
        for(int i = 1; i <= N; i++) {
            for(int space = N-i; space >= 1; space--) {
                System.out.print("  ");
            }
            for(int stars = 1; stars <= 2*i - 1; stars++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}