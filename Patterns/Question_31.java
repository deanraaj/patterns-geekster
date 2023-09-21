// Question 31 :
// N = 5
// 5 4 3 2 *
// 5 4 3 * 1
// 5 4 * 2 1
// 5 * 3 2 1
// * 4 3 2 1


public class Question_31 {
    public static void main(String[] args) {
        int N = 5;
        for(int i = 1; i <= N; i++) {
            int count = N;
            for(int j = 1; j <= N; j++) {
                if(i + j == N+1) {
                    System.out.print("*" +"\t"); 
                }
                else {
                    System.out.print(count + "\t");
                }
                count--;
            } 
            System.out.println();
        }
    }
}
