public class LoopsDemo {
    public static void main(String[] args) {
        // for loop: print numbers 1 to 5
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loop: print numbers 1 to 5
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // do-while loop: print numbers 1 to 5
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
