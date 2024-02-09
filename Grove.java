import java.util.ArrayList;

public class Grove 
{
    // instance variables for an Array of Tree's (size 12), and grove name
    public String groveName;
    ArrayList<Tree>Trees;
    

    // parameterized constructor
    public Grove(String groveName)
    {
        this.groveName = groveName;
        this.Trees = new ArrayList<Tree>();
    }
    
    
     
    // plants a Tree object in the first available spot. 
    public int treePlanter(Tree t)
    {
        if (Trees.size() < 12)
        {
            Trees.add(t);
            return Trees.size() - 1; // returning where the tree is planted
        }
        else // no spots 
        {
            return -1; 
        }
        
    }

    // removes a Tree object from a given spot.
    public Tree treeRemover(int treeIndex)
    {
        if (treeIndex >= 0 && treeIndex < Trees.size())
        {
            return Trees.remove(treeIndex);
        }
        else 
        {
            return null; // returning nothing if the tree index is invalid
        }
        
    }
    
    // ToString() that prints the number of Tree's in the array
    public String toString() 
    {
        return String.valueOf(Trees.size());
    }
        
}
