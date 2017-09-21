package inheritance.interfaceLearning;

/**
 * Created by gorod on 12.09.2017.
 */
public class ShapeTest {

    public static void main(String[] args) {
        // реализуем интерфейс
        Shape shape = new Circle(10);

        shape.draw();
        System.out.println("Площадь = " + shape.getArea());

        //легко переключаемся с одной реализации на другую
        shape = new Rectangle(10,10);
        shape.draw();
        System.out.println("Площадь = " + shape.getArea());
    }

}
