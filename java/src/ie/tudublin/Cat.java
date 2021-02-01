package ie.tudublin;

public class Cat extends Animal
{

    public Cat(String name)
    {
        super(name);
    }

    private int numlives;

    public int getnumlives()
    {
        return numlives;
    }

    public void setnumlives(int numlives)
    {
        this.numlives = 9;
    }

    static int kill(int numlives)
    {
        while (numlives > 0)
        {
            System.out.println("Ouch!\n");
            numlives--;
        }
        if (numlives == 0)
        {
            System.out.println("Cat had died\n");
        }
    }

    
}