import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    /** prints all of the buildings */
    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        //10 new buildings
        myMap.addBuilding(new Building("McConnell Hall", "01063, 2 Tyler Ct, Northampton, MA 01060", 6));
        myMap.addBuilding(new Building("Julia McWilliams Child ’34 Campus Center", "Smith College Campus Center, 100 Elm St, Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("Schacht Center for Health and Wellness", "21 Belmont Ave, Northampton, MA 01060")); // I don't know how many floors it has
        myMap.addBuilding(new Building("Sage Hall", "144 Green St, Northampton, MA 01063"));
        myMap.addBuilding(new Building("Ainsworth Gym and Olin Fitness Center", "102 Lower College Ln, Northampton, MA 01063"));
        myMap.addBuilding(new Building("Smith College Conference Center", "49 College Ln, Northampton, MA 01060"));
        myMap.addBuilding(new Building("Hillyer Hall", "20 Elm St, Northampton, MA 01063"));
        myMap.addBuilding(new Building("Hatfield Hall", "3 Neilson Drive, Northampton, MA 01063"));
        myMap.addBuilding(new Building("60 Elm St, Northampton, MA 01060"));
        myMap.addBuilding(new Library("7 Neilson Drive, Northampton, MA 01063"));
        myMap.addBuilding(new Cafe("Compass Cafe","address", 2));
        System.out.println(myMap);
    }
    
}
