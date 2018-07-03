public class Main
{
    public static void main(String[] args) {
        new Threads("YouTube").start();
        new Threads("Dailymotion").start();
        new Threads("Vimeo").start();
    } 
}