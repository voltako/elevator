public class Main {
    public static void main(String[] args) {
        Bulding bulding = new Bulding();
        while (true){
            bulding.callElev();
            System.out.println(bulding.elevators);
        }
    }
}
