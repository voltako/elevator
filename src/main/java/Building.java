import java.util.ArrayList;

public class Building {


    ArrayList<Elevator> elevators = new ArrayList<>();

    Elevator elev1 = new Elevator(1,1);
    Elevator elev2 = new Elevator(2,5);
    Elevator elev3 = new Elevator(3,9);




    public void callElevator(int floor){
        isAvailableOnFloor(floor);
        }

    public void setStatus(){
        elevators.clear();
        elevators.add(elev1);
        elevators.add(elev2);
        elevators.add(elev3);
        System.out.println(elevators);
    }

    public void isAvailableOnFloor(int floor){
        if((floor == elev1.getFloor())| (floor == elev2.getFloor()) | (floor == elev3.getFloor())){
            setStatus();
        }
        else {
            if(floor > 0 & floor < 10) {
                setDistance(floor);
            }
            else{
                System.out.println("Ошибка! Введите корректный этаж");
            }
        }
    }

    public void setDistance(int floor) {
        int dist1 = Math.abs(floor - elev1.getFloor());
        int dist2 = Math.abs(floor - elev2.getFloor());
        int dist3 = Math.abs(floor - elev3.getFloor());
        if (dist1 < dist2) {
            if (dist3 < dist1) {
                elev3.setFloor(floor);
            } else {
                elev1.setFloor(floor);
            }
            if ((elev1.getFloor() != 1) | (elev3.getFloor() != 1)) {
                elev2.setFloor(1);
            } else {
                elev2.setFloor(floor);
            }
            setStatus();
        }
        else {
            if (dist3 < dist2) {
                elev3.setFloor(floor);
            }else {
                elev2.setFloor(floor);
            }if ((elev2.getFloor() != 1) | (elev3.getFloor() != 1)) {
                elev1.setFloor(1);
            }else{
                elev3.setFloor(1);
            }
            setStatus();
        }
    }
}
