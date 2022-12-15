import java.util.Scanner;
public class diamond_with_stars {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter height of diamond:");
        int n=inp.nextInt();

        for (int i=1;i<=n;i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int t = 1; t <= n - i; t++) {
                System.out.print(" ");
            }
            for (int v=1;v<=((2 * i) - 1);v++){
                System.out.print("*");
            }
            System.out.println();
        }



}}