package w18comp1011s1apr5;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author JWright
 */
public class CustomButtonHandler implements EventHandler
{
    @Override
    public void handle(Event event)
    {
       System.out.println("This message is from our custom event handler");
    }
}
