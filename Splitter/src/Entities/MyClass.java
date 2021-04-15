package Entities;

interface SupInterface
{

    void proc1();
    void proc2();

}

interface SubInterface extends SupInterface {

    void proc3();

}

class HackerEarth implements SubInterface
{
    public void proc1()
    {
        System.out.println("Python");
    }

    public void proc2()
    {
        System.out.println("Java");
    }

    public void proc3()
    {
        System.out.println("PHP");
    }
}

class MainClass
{
    public static void main(String arg[])
    {
        HackerEarth ob = new HackerEarth();
        ob.proc1();
        ob.proc2();
        ob.proc3();
    }
}