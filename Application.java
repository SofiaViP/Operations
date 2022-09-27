import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        String operation = scanner.nextLine();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Result: ");
        System.out.println(a + b);
        if (operation.equals("sum")){
            System.out.println(a + b);}
        else if (operation.equals("mul")) {
            System.out.println(a * b);
        }
        else if (operation.equals("div")){
            System.out.println(a / b);
        }
        else {
            System.out.println(a - b);}
    }
}