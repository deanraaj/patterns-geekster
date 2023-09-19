// Question 10:
// N = 5   
//         * 
//       *   *
//     *   *   *
//   *   *   *   *  
// *   *   *   *   *


public class Question_11 {
    public static void main(String[] args) {
        int N = 5; 
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("  "); 
            }
            
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*   ");
            }
            
            
            System.out.println();
        }
    }
}
