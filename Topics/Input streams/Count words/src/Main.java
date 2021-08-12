import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        reader.close();
        while (true) {
            if (input.trim().isEmpty()) {
                System.out.println("0");
                break;
            } else {
                String[] parts = input.trim().split("\\s+");
                System.out.println(parts.length);
                break;
            }
        }


    }
}