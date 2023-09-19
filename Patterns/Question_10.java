// Question 10:
// N = 5    
// * * * * * * * * *
//   * * * * * * * 
//     * * * * *
//       * * *
//         * 


public class Question_10 {
    public static void main(String[] args) {
        int N = 5;

        for(int i = N; i >= 1; i--) {
            
            for(int j = 1; j <= N-i; j++) {
                System.out.print("  ");
            }

            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
