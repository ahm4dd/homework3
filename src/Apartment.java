public class Apartment extends Property {
    private int floorNumber;
    private boolean hasParkingLot;

    Apartment(double area, int rooms, String neighborhood, double price, int floorNumber, boolean hasParkingLot){
        super(area,rooms,neighborhood,price);
        this.floorNumber = floorNumber;
        this.hasParkingLot = hasParkingLot;
    }

    public int getFloorNumber(){
        return floorNumber;
    }

    public boolean getHasParkingLot(){
        return hasParkingLot;
    }

    public void setFloorNumber(int floorNumber){
        this.floorNumber = floorNumber;
    }

    public void setHasParkinglot(boolean hasParkingLot){
        this.hasParkingLot = hasParkingLot;
    }

    @Override
    public void display() {
        System.out.println("Type: " + getClass() + "\nArea: " + getArea() + "\nRooms: "+ getRooms() + "\nNeighborhood: "+ getNeighborhood() + "\nPrice: " + getPrice());
        System.out.println("Floor numbers: " + getFloorNumber() + "\nHas Parking lot: " + getHasParkingLot());
    }
}
