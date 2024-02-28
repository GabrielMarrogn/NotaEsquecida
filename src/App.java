import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int m = sc.nextInt();

        int b = m * 2 - a;

        System.out.println(b);
        sc.close();
    }
}
