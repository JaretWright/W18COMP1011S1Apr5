package w18comp1011s1apr5;

/**
 *
 * @author JWright
 */
public class StackExample
{
    public static void main(String[] args)
    {
        firstMethod();
    }
    
    public static void firstMethod()
    {
        secondMethod();
        Thread.dumpStack();
    }
    
    public static void secondMethod()
    {
        Thread.dumpStack();
    }
}
