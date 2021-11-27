
package vol_of_cube;
import java.util.Scanner;

public class Vol_of_cube {

    public static void main(String[] args) {
        float s, vol, s_area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        s = sc.nextFloat();
        vol = s * s * s;
        s_area = 6 * s * s;
        System.out.println("The volume: " + vol);
        System.out.println("The surface area is: " + s_area);
    }
    
}
