import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class kelipatan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input angka : ");
        int n = scan.nextInt();

        for (int i = 0; i <=n ; i++) {
            if(i%3 ==0 && i%4==0) {
                System.out.print(" OKYES");
            } else if (i%3==0){
                System.out.print(" OK");
            } else if (i%4==0) {
                System.out.print(" YES");
            } else {
                System.out.print(" " + i);
            }
        }
        scan.close();
    }
}