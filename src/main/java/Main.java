import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Building bulding = new Building();
        while (true){
            System.out.println("Введите этаж: ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                bulding.callElevator(scanner.nextInt());
            }else {
                System.out.println("Ошибка! Введите корректный этаж");
            }
        }
    }
}
