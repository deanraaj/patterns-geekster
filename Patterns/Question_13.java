// Question 13:
// N = 5

// *
// * * 
// * * * 
// * * * *
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

public class Question_13 {
    public static void main(String[] args) {
        int N = 5;
        
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = N-1; i>= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
