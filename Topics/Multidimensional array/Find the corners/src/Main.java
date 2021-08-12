

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < twoDimArray.length; i++){
//            for (int j = 0; j < twoDimArray[i].length; j++){
//                int n = scanner.nextInt();
//                twoDimArray[i][j] = n;
//            }
//        }

        System.out.print(twoDimArray[0][0] + " ");
        System.out.println(twoDimArray[0][twoDimArray[0].length - 1]);
        System.out.print(twoDimArray[twoDimArray.length - 1][0] + " ");
        System.out.println(twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1]);

    }
}
