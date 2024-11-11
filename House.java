/* This is a stub for the House class */

// add boolean for if there is an elevator

import java.util.ArrayList;

public class House extends Building {

    private ArrayList <String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
    private boolean hasDiningRoom;


    /**
     * Constructor
     * @param name name of house
     * @param address house's address
     * @param nFloors number of floors
     * @param residents arraylist of residents
     * @param diningRoom does it have a dining room?
     */
    public House(String name, String address, int nFloors, ArrayList <String> residents, boolean diningRoom) {
        super(name, address, nFloors);
        this.residents = residents;
        this.hasDiningRoom = diningRoom;
        this.hasElevator = true;
        System.out.println("You have built a house: 🏠");
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
     * hasDiningRoom
     * @return returns boolean
     */
    public boolean hasDiningRoom() {
        return this.hasDiningRoom;
    }

    /**
     * nResidents
     * @return returns int number of residents
     */
    public int nResidents() {
        return this.residents.size();
    }

    /**
     * moveIn
     * @param name adds name to arraylist of residents
     */
    public void moveIn(String name) {
        this.residents.add(name);

    }

    /**
     * moveOut
     * @param name
     * @return removes name from arraylist and returns name
     */
    public String moveOut(String name) { // return the name of the person who moved out
        this.residents.remove(name); // if isResident, remove from arraylist; otherwise, "[name] is not living in this house!"
        return name;
    }


    /**
     * isResident
     * @param person
     * @return returns boolean
     */
    public boolean isResident(String person) {
        return residents.contains(person);

    }

    @Override
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + moveIn(name) \n + moveOut(name) \n + hasDiningRoom() \n + nResidents() \n + isResident(name)");
    }

    public static void main(String[] args) {
        //new House();
    }

}

