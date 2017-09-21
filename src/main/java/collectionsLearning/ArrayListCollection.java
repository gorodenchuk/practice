package collectionsLearning;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by NGorodenchuk on 9/21/2017.
 */
public class ArrayListCollection {
    ArrayList<Object> arlst = new ArrayList<Object>();

    public void setDigits() {
        int y = 11;
        int sum = 1;
        int count = 1;
        int x = 2;

        while ( count <= y){
            arlst.add(sum = count ++);
        }
    }

    void iterateData() {
        ListIterator<Object> it = arlst.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }


    public static void main(String[] args){
        ArrayListCollection a = new ArrayListCollection();
        CollectionData b = new CollectionData(222, 333);
        a.setDigits();
        a.arlst.add(1, 200);
        a.arlst.add(b);
        a.iterateData();
        System.out.println(a.arlst.size());
    }
}
