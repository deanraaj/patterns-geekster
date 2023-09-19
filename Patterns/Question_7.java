
// Question 7:
// N = 5   
// * * * * *
// *       *
// *       *
// *       * 
// * * * * *


public class Question_7 {
    public static void main(String[] args) {
        int N = 5;

        for(int r = 0; r < N; r++) {
            for(int c = 0; c < N; c++) {
                if(r == 0 || r == N-1 || c == 0 || c == N-1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
