package w18comp1011s1apr5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author JWright
 */
public class CollectionSorting
{
    public static void main(String[] args)
    {
        List<String> friends = Arrays.asList("Paul","June","Rodrigo","Frank","Francis");
        
        //Since String's have a compare method, we can sort directly
        Collections.sort(friends);
        System.out.println(friends);
        
        //using an anonymous inner class to sort the collection of friends
        //from z to a
        Collections.sort(friends, new Comparator<String>() {
            @Override
            public int compare(String friend1, String friend2)
            {
                return friend2.compareTo(friend1);
            }
        });
        System.out.println("Friends in reverse order: "+friends);
    }
}
