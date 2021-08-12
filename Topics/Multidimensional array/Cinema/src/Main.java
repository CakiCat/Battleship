import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < rows; i++) {
            int counter  = 0;
            for (int j = 0; j < column; j++) {
                if (array[i][j] == 0) {
                    counter++;

                } else {
                    counter = 0;
                }

                if (counter >= k) {
                    result = i + 1;
                    break;
                }
            }
            if (result != 0) {
                break;
            }


        }
        System.out.println(result);
    }
}