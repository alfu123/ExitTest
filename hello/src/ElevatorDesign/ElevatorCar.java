package ElevatorDesign;

public class ElevatorCar {

    int currentFloor;
    int destinationFloor;
    Direction direction;
    Location location;

    public ElevatorCar(int currentFloor, int destinationFloor, Direction direction, Location location) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.direction = direction;
        this.location = location;
    }
}
