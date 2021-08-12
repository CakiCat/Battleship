import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] intArray = new int[n][n];
        String out = "YES";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++){
                int m = scanner.nextInt();
                intArray[i][j] = m;
            }

        }
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if(intArray[i][j] != intArray[j][i]) {
                    out = "NO";
                    break;
                }
            }

        }
        System.out.println(out);
    }
}