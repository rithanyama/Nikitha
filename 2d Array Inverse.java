import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[2][2];
        double[][] inverse = new double[2][2];
        System.out.println("Enter elements of 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        double det = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        if (det == 0) {
            System.out.println("Inverse does not exist");
        } else {
            inverse[0][0] =  a[1][1] / det;
            inverse[0][1] = -a[0][1] / det;
            inverse[1][0] = -a[1][0] / det;
            inverse[1][1] =  a[0][0] / det;
            System.out.println("Inverse matrix:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(inverse[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
