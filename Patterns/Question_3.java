// Question 3:
// N = 5
// * * * * *
// * * * *
// * * *
// * *
// * 

public class Question_3 {
    public static void main(String[] args) {
        int N = 5;
    //outer loop for columns
    for(int i = N; i > 0; i--) {
        // inner loop for rows
        for(int j = 0; j < i; j++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    }
}