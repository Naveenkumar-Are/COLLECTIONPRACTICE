import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionPractice {
    public static void main(String[] args) {

      List list= new  ArrayList();
      list.add(20);
        list.add(30);
        list.add(240);
        list.add(202);
        list.add(60);
        System.out.println("unsorted list"+list);

        Collections.sort(list);
        System.out.println("sorted list"+list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.rotate(list,1);
        System.out.println(list);

        Collections.rotate(list,-1);
        System.out.println(list);

      System.out.println(Collections.frequency(list,60));

    }
}