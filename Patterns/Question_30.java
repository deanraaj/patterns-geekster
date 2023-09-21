// Question 30 :
// N = 5
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1


public class Question_30 {
    public static void main(String[] args) {
        int N = 5;
        for(int i = 1; i <= N; i++) {
            for(int j = N; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
