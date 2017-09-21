package secondPackage;

/**
 * Created by gorod on 09.09.2017.
 */
public class AccessDemo {
    public static void main(String args[]) {
/*        MyClass ob = new MyClass();


        ob.setAlpha(-99);
        System.out.println("ob.getAlpha is " + ob.getAlpha());

        ob.beta = 88;
        ob.gamma = 99;
*/

        MyClass o = new MyClass(123);
        System.out.println("o " + o.getValue1());
//        System.out.println("o- " + o.alpha);

        MyClass t = new MyClass("123");
        System.out.println("t" + t.getValue2());
        System.out.println("t-" + t.beta);

        MyClass th = new MyClass(123.1);
        System.out.println("th" + th.getValue3());
        System.out.println("th-" + th.gamma);

    }
}
