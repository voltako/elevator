import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        while (true){
            System.out.println("Введите этаж: ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int floor = scanner.nextInt();
                building.callElevator(floor);
            }else {
                System.out.println("Ошибка! Введите корректный этаж");
            }
        }
    }
}
