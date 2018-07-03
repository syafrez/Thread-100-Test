public class Threads extends Thread
{
    public Threads(String str)
    {
        super(str);
    }
    
    public void run()
    {
        for (int i = 1; i <= 100; i++) {
            System.out.println("# " + i + ": " + getName());
            try {sleep((int) (Math.random() * 1500));}
            catch (InterruptedException e){e.printStackTrace();}
        }
        System.out.println("Thread Test Completed for: " + getName());
    }
}