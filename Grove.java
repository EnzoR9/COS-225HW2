import java.util.ArrayList;

public class Grove 
{
    //Contains two instance variables for an Array of Tree's (size 12), and a grove name.
    //You may use an ArrayList of Tree's if you wish
    public String groveName;
    ArrayList<String>Trees;
    

    //◦ Implements a parameterized constructor that takes (and sets) a single parameter for the name of the grove
    public Grove(String groveName)
    {
        this.groveName = groveName;
        this.Trees = new ArrayList<String>();
    }
    
        //◦ Implements a method that will plant a Tree object in the first available spot. 
        // The method should take a Tree object as a parameter, and return an int identifying the spot where the tree is planted. If no spots are open, return -1.
        //◦ Implements a method that will remove a Tree object from a given spot.
        // The method should take an int as a parameter, and remove and return the Tree object at that location in the array.
        //◦ Implement a ToString() method that will print a single int representing the number of Tree's in the array
}
