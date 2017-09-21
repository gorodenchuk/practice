package secondPackage;

/**
 * Created by gorod on 09.09.2017.
 */
public class MyClass {
    private int alpha = 123;
    public String beta = "123";
    double gamma = 123.1;

    public MyClass(int alpha) {
        this.alpha = alpha;
    }

    public MyClass(String beta) {
        this.beta = beta;
    }
    public MyClass(double gamma) {
        this.gamma = gamma;
    }

    int getValue1(){
        return alpha;
    }
    String getValue2(){
        return beta;
    }
    double getValue3(){
        return gamma;
    }
    //    void setAlpha(int a) {
//        alpha = a;
//    }
//
//    int getAlpha() {
//        return alpha;
//    }
}
