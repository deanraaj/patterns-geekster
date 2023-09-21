/*
Question 29 :
N = 5
                1
            2   0   2
        3   0   0   0   3
    4   0   0   0   0   0   4
5   0   0   0   0   0   0   0   5

 */

public class Question_29 {
    public static void main(String[] args) {
        int N = 5;
        
        for(int i = 1; i <= N; i++) {
            for(int space = N-i; space >= 1; space--) {
                System.out.print("\t");
            }
            
            for(int stars = 1; stars <= 2*i - 1; stars++) {
                if(stars == 1 || stars == 2*i-1) {
                    System.out.print(i + "\t");
                } else {
                    System.out.print(0 + "\t");
                }
            }
            System.out.println();
        }
    }
}