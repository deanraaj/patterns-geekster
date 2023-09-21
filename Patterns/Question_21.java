/*
 * Question_21 :
 * N = 5
 
 *                              *
 *  *                       *   *
 *  *   *               *   *   *
 *  *   *   *       *   *   *   *
 *  *   *   *   *   *   *   *   *
 


 */
public class Question_21 {
    public static void main(String[] args) {
        int N = 5;

        for(int row = 1; row <= N; row++) {
            // first trigangle
            // first stars
            for(int i = 1; i <= row; i++) {
                System.out.print("*" + "\t");
            }
            // first spaces
            for(int space = N-row; space >= 1; space--) {
                System.out.print("\t");
            }

            // second triangle
            // second spaces
            for(int space = N-row-1; space >= 1; space--) {
                System.out.print("\t");
            }
            //second stars
            for(int i = 1; i <= row; i++) {
                if(i != N)System.out.print("*" + "\t");
            }

            System.out.println(); // change new line

        }
    }
}
