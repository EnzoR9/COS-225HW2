public class Tree 
{
    // contains three instance variables for ID number, age, and species name
    public int idNumber;
    public int age;
    public String speciesName;
    // implements a parameterized constructor that will create a Tree object, and sets the vars
    public Tree(int idnum, int age, String species)
    {
        this.idNumber = idnum;
        this.age = age;
        this.speciesName = species;
    }

}