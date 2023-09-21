/*
Question 25 :
N = 5
        1 
      2 3 4
    5 6 7 8 9 
  10 11 12 13 14 15
16 17 18 19 20 21 22 23

 */

public class Question_25 {
    public static void main(String[] args) {
        int N = 5;
        int count = 1;
        for(int i = 1; i <= N; i++) {
            for(int space = N-i; space >= 1; space--) {
                System.out.print("\t");
            }
            for(int stars = 1; stars <= 2*i - 1; stars++) {
                System.out.print(count++ + "\t");
            }
            System.out.println();
        }
    }
}