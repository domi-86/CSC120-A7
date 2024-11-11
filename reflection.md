Use this file to record your reflection on this assignment.

- Which methods did you decide to `overload`, and why?
    I overloaded sellCoffee() in the Cafe class because there's probably a default coffee, like how the default size of meals at fast food is dedium and and comes with specific things depending on the meal.
    I also overloaded printCollection() in the Library class so you can choose to print only available books or only unavailable/checked out books just to have more of a filter in the collection.

- What worked, what didn't, what advice would you give someone taking this course in the future?

        if (((this.activeFloor + 1) != floorNum) || ((this.activeFloor - 1) != floorNum)) {
                    throw new RuntimeException("This building does not have an elevator.");
                }

    This didn't work and threw an exception every time T ran goTo(), so I changed it to a positive statement instead and it worked.

    ran into a prblem overloading printCollection to only print available or unavailable tiles. You can't use cnoditions with forEach(), so I had to look up an alternative method of iteration. 

    I had an issue with House and realized I just put a curly brace in the wrong place.
    

