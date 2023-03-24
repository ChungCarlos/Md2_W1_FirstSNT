import java.util.Scanner;

public class Main {
    public static boolean check(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu SNT: ");
        int number = scanner.nextInt();
        for (int i = 0, count = 0; count < number; i++) {
            if (check(i)) {
                System.out.println(i);
                count++;
            }
        }

    }
}
