import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] star = new char[n][n];
        int b = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = '.';
            }
        }
        for (int i = 0; i < n; i++) {
            star[i][b] = '*';
        }
        for (int i = 0; i < n; i++) {
            star[b][i] = '*';
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    star[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            star[i][j] = '*';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
               if (j < n - 1) {
                   System.out.print(star[i][j] + " ");
               }
               else {
                   System.out.print(star[i][j]);
               }

            }
            System.out.println();
        }


    }

}