public class Main {
    public static void main(String[] args) {
        RealEstate agency = new RealEstate();
        Apartment myApt = new Apartment(200, 3, "Anything", 300, 4, true);

        myApt.display();
        agency.addProperty(myApt);
        System.out.println("==============================");
        System.out.println(agency.getProperty(0));
        {
            Apartment myAptCheck = (Apartment) agency.getProperty(0);
            myAptCheck.display();
        }
        agency.removeProperty(0);

    }
}