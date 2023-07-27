import java.util.LinkedList;;

/**
 * Reverse
 */
public class Reverse {

    public LinkedList reverser(LinkedList<T> list) {
        int size = list.size();
        LinkedList<T> cpy = new LinkedList<T>(list);

        for (int i = 0; i < size; i++) {
            T element = cpy.last();
            list.remove();
            list.add(element);
        }

        return list;
    }
}