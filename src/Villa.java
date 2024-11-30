public class Villa extends Property {
    private boolean hasPool;
    private int adjacentStreet;

    Villa(double area, int rooms, String neighborhood, double price, boolean hasPool, int adjacentStreet){
        super(area,rooms,neighborhood,price);
        this.hasPool = hasPool;
        this.adjacentStreet = adjacentStreet;
    }

    public boolean getHasPool(){
        return hasPool;
    }

    public int getAdjacentStreet(){
        return adjacentStreet;
    }

    public void setHasPool(boolean hasPool){
        this.hasPool = hasPool;
    }

    public void setAdjacentStreet(int adjacentStreet){
        this.adjacentStreet = adjacentStreet;
    }

    @Override
    public void display(){
        System.out.println("Type: " + getClass() + "\nArea: " + getArea() + "\nRooms: "+ getRooms() + "\nNeighborhood: "+ getNeighborhood() + "\nPrice: " + getPrice());
        System.out.println("Has swimming pool: " + getHasPool() + "\nNumber of adjacent streets: " + getAdjacentStreet());
    }
}
