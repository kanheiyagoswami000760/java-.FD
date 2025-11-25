import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class practice6 {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        //calling the iterator interface 
        Iterator iterator = list.iterator();

        System.out.println("forword traversal");

        while (iterator.hasNext()) {
            System.out.println(iterator.next()+"");
        }
        System.out.println();
        iterator.remove();
        System.out.println(list);


        //calling the list iterator interface 

        ListIterator listIterator = list.listIterator();

        System.out.println("backward traversal");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous()+"");
        }

        
    }
}