public class Question_32 {
    public static void main(String[] args) {
        int N = 5;
        int stars = 1, count = 1;
        for(int row = 1; row <= 2*N-1; row++) {
            for(int col = 1; col <= stars; col++) {
                if(col % 2 == 1) System.out.print(count + " ");
                else System.out.print("*" + " ");
            }
            if(row < N) {
                stars += 2;
                count++;
            } else {
                stars -= 2;
                count--;
            }

            
            System.out.println();
        }
    }
}
