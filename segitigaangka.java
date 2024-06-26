import java.util.Scanner;

public class segitigaangka {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input angka : ");
        int n = scan.nextInt();
        System.out.println();

        //SOAL SEGITIGA ANGKA A
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
                }
            System.out.println();
        }
        System.out.println();

        //SOAL SEGITIGA ANGKA B
        System.out.print("Input angka : ");
        int input = scan.nextInt();
        for (int k = 1; k <= input; k++) {
            for (int l = k; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }

        //SOAL SEGITIGA ANGKA C
        int data =0;
        // boolean increment= false;
        for(int i=1; i<=input; i++) {
            for(int j=1; j<=i; j++) {
                data++;
                System.out.print(data+" ");
            }
            System.out.println();
        }

        //SOAL D
        System.out.println("Masukkan index : ");
        int n1 = scan.nextInt();
        int num =1;

        int[][] mat = new int[n1][n1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                        if (i % 2 == 0) {
                            
                            mat[j][i] = num++;
                        } else {
                            mat[3 - j][i] = num++;
                        }
                    }
                }
        
                // Menampilkan matriks hasil
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(mat[i][j] + " ");
                    }
                    System.out.println();
                
            }
            scan.close();
            
        }
    
    
}
