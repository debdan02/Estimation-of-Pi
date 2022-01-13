package package1;

import java.util.Scanner;
public class PiEstimation {
    static boolean present(double x, double y) {
        return (x - 0.5) * (x - 0.5) + (y - 0.5) * (y - 0.5) <= 0.25;
    }
    public static void main(String[] args) {
        /* maintaining a cartesian grid
            (0, 1)          (1, 1)
            (0, 0)          (1, 0)

            to randomly generate 'n' random cartesian points and estimate Pi
            by a ratio
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = 0;
        for(int i = 0; i < n; ++i) {
            double x = Math.random(), y = Math.random();
            if(present(x, y)) c++;
        }
        System.out.print(4.0*((double)(c)/(n)));
    }
}
