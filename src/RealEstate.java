import java.util.ArrayList;

public class RealEstate {
    private ArrayList<Property> properties = new ArrayList<Property>();


    public Property getProperty(int index){
        return properties.get(index);
    }

    public void displayProperty(int index){
        properties.get(index).display();
    }

    public void addProperty(Property property){
        if(properties.size() >= 100)
            throw new IllegalArgumentException("The agency cannot handle more than 100 properties at a time");
        else
            properties.add(property);
    }

    public void removeProperty(int index){
        properties.remove(index);
    }

}
