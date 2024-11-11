/* This is a stub for the Library class */

import java.util.Hashtable;
import java.util.Enumeration;

public class Library extends Building {

    private Hashtable <String, Boolean> collection;

    /**
     * Constructor
     * @param name
     * @param address
     * @param nFloors
     */
    public Library(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.collection = new Hashtable <> ();
        this.hasElevator = true;
        System.out.println("You have built a library: 📖");
    }

    @Override
    public void goToFloor(int floorNum) {
        
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        if (floorNum < 1 || floorNum > this.nFloors) {
            throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
        }

        System.out.println("You are now on floor #" + floorNum + " of " + this.name);
        this.activeFloor = floorNum;
    }



    /**
     * addTitle
     * @param title
     */
    private void addTitle(String title) {
        this.collection.put(title, true);
    }


    /**
     * removeTitle
     * @param title
     * @return returns the book title that was removed
     */
    private String removeTitle(String title) {
        this.collection.remove(title);
        return title;

    }

    /**
     * checkOut
     * @param title
     */
    public void checkOut(String title) {
        this.collection.replace(title, false);
    }

    /**
     * returnBook
     * @param title
     */
    public void returnBook(String title) {
        this.collection.replace(title, true);
    }

    /**
     * containsTitle
     * @param title
     * @return returns boolean if a title is in the collection
     */
    public boolean containsTitle(String title) {
        return this.collection.contains(title);
    }

    /**
     * isAvailable
     * @param title
     * @return returns the value for the key title - whether or not the book is available
     * @throws Exception if title is not in collection
     */
    public boolean isAvailable(String title) {
        try {
            return this.collection.get(title);
        } catch (Exception e) {
            throw new RuntimeException("This title is not in the collection!");
        }

    }

    @Override
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + checkOut(title) \n + returnBook(title) \n + containsTitle(title) \n + isAvailable(title)");

    }

    /**
     * printCollection
     * prints out the entire collection in an easy-to-read way (including checkout status)
     */
    public void printCollection() {
        //System.out.println(this.collection.toString());

        this.collection.forEach((key, value) -> System.out.println("TITLE: " + key + "    AVAILABLE: " + value));


    }

    /**
     * Overloaded prinCollection to print only available or not available titles
     * @param availability
     */
    public void printCollection(boolean availability) {
        Enumeration<String> c = this.collection.keys();

        while (c.hasMoreElements()) {

            String title = c.nextElement();

            if (availability == true && isAvailable(title)) {
                System.out.println("TITLE: " + title + "    AVAILABLE: true");
            }
            else if (availability == false && !isAvailable(title)) {
                System.out.println("TITLE: " + title + "    AVAILABLE: false");
            }
            else {
                System.out.println("No titles match your search.");
            }
        }

    }


    public static void main(String[] args) {
        Library neilson = new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 5);
        //neilson.new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 5);

        neilson.addTitle("The Lorax by Dr. Seuss");
        System.out.println(neilson.isAvailable("The Lorax by Dr. Seuss"));
        neilson.checkOut("The Lorax by Dr. Seuss");
        neilson.printCollection();
        System.out.println(neilson.isAvailable("The Lorax by Dr. Seuss"));
        neilson.returnBook("The Lorax by Dr. Seuss");
        System.out.println(neilson.isAvailable("The Lorax by Dr. Seuss"));
        neilson.removeTitle("The Lorax by Dr. Seuss");
        //System.out.println(neilson.isAvailable("Vicious by V.E. Schwab"));
        neilson.addTitle("Vicious by V.E. Schwab");
        neilson.printCollection();

    }

}