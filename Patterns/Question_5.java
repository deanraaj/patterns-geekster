// Question 5:
// N = 5   
// * * * * *
//   * * * *  
//     * * *
//       * * 
//         *



public class Question_5 {
    public static void main(String[] args) {
        int N = 5;
        for(int i = N; i > 0; i--) {
            
            for(int k=0; k < N-i; k++) {
                System.out.print("  ");
            }

            for(int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            
            System.out.println();
        }   
    
    }
}