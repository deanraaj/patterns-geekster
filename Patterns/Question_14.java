/*
 *  Question 14:
 *  N = 5
*         *
        * *
      * * *
    * * * *
  * * * * *
    * * * *
      * * *
        * *
          *
 */

public class Question_14 {
    public static void main(String[] args) {
        int N = 5;

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= N-1; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= N-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
