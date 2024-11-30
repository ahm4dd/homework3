public class FurnishedApartment extends Apartment {
    private int rating;

    FurnishedApartment(double area, int rooms, String neighborhood, double price, int floorNumber, boolean hasParkingLot){
        super(area,rooms,neighborhood,price,floorNumber,hasParkingLot);
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        if (rating >= 1 && rating <= 5 )
            this.rating = rating;

        else
            throw new IllegalArgumentException("Rating has to be between 1 and 5");
    }

    @Override
    public void display(){
        System.out.println("Type: " + getClass() + "\nArea: " + getArea() + "\nRooms: "+ getRooms() + "\nNeighborhood: "+ getNeighborhood() + "\nPrice: " + getPrice());
        System.out.println("Floor numbers: " + getFloorNumber() + "\nHas Parking lot: " + getHasParkingLot());
        System.out.println("Furniture rating:" + getRating());
    }
}
