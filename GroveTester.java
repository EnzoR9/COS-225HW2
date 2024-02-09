public class GroveTester
{
    // main function
    public static void main(String[] args)
    {
        // new grove
        Grove g1 = new Grove("Grove 1");
        System.out.println(g1);

        // making 7 Tree objects and adding them to Grove 1 (g1)
        for (int i = 0; i < 7; i++)
        {
            Tree spruce = new Tree(i + 1, 37, "Spruce");
            g1.treePlanter(spruce); 
        }
        System.out.println(g1);

        // removing trees at index 3 and 5
        g1.treeRemover(3);
        g1.treeRemover(5);
        System.out.println(g1);

        // making a maple tree and adding it to Grove 1
        Tree maple = new Tree(1, 13, "Maple");
        g1.treePlanter(maple);
        System.out.println(g1);


    }
}
