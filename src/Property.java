abstract public class Property {
    private double area;
    private int rooms;
    private String neighborhood;
    private double price;

    public Property(double area, int rooms, String neighborhood, double price) {
        this.area = area;
        this.rooms = rooms;
        this.neighborhood = neighborhood;
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public int getRooms() {
        return rooms;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public double getPrice() {
        return price;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setRooms(int rooms){
        this.rooms = rooms;
    }

    public void setNeighborhood(String neighborhood){
        this.neighborhood = neighborhood;
    }

    public void setPrice(double price){
        this.price = price;
    }


    abstract public void display();
}
