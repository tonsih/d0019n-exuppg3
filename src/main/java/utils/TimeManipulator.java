package utils;

public class TimeManipulator
{
    /**
     * A private no-arg constructor for the class. Prevents initiation of an
     * instance.
     */
    private TimeManipulator()
    {
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}