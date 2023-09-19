// Question 15:
// N = 5   
// * * * * *
//     * * * *
//         * * * 
//             * * 
//                 *
//             * *
//         * * *
//      * * * *
//  * * * * *




public class Question_15 {
    public static void main(String[] args) {
        int N = 5;
        int stars = N;
        int spaces = 0;
        while(stars >= 1) {
            for(int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }
            for(int j = 0; j < stars; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            spaces = spaces + 2;
            stars = stars - 1;
        } 

        spaces = spaces - 4;
        
        stars = 2;
        while(stars <= N) {
            for(int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }
            for(int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces = spaces - 2;
            stars++;
        }
    
    }
}