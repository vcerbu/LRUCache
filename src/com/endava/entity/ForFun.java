import java.util.*;

/**
 * Created by vcerbu on 3/29/2017.
 */
public class ForFun {

    public static void main(String... args) {

        List<Integer> intList = new LinkedList<>();//creates a LinkedList with Integer objects
        intList.add(1); // adds to this list value "1"
        ((List<Double>) (Object) intList).add(1.55);//casts Integer list to Object
        //then Object to Double list and to this double list is possible to add a double value
        ((List<Object>) (Object) intList).add(new Object());//casts Integer list to Object
        //then Object to Object list and to this Object list adds a new Object.

        //All this is possible because Collection interface extends Object class,
        //and List implements Collection, what means it extends Object too.

        for (Object element : intList) {
            System.out.println(element);

        }

    }
}
