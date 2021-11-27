
package tables;
import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
