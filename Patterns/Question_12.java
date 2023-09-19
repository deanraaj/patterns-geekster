// Question 12:
// N = 5   
//         * 
//       * * *
//     * * * * *
//   * * * * * * *  
// * * * * * * * * *


public class Question_12 {
    public static void main(String[] args) {
        int N = 5;

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                if(k%2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("! ");
                }
            }
            System.out.println();
        }
    }
}
