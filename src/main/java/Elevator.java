public class Elevator {
    private int id;
    private int floor;


    public Elevator(int id,int floor){
        this.id = id;
        this.floor = floor;

    }
    @Override
    public String toString(){
        return "Номер лифта: "+this.id+" "+"Этаж лифта: "+this.floor;
    }

    public int getFloor(){
        return floor;
    }
    public void setFloor(int floor){
        this.floor = floor;
    }



}
