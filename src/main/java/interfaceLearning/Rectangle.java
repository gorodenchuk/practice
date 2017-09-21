package interfaceLearning;

/**
 * Created by gorod on 12.09.2017.
 */

// Класс Прямоугольник(Rectangle) реализует интерфейс Форма(Shape)
public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double w, double h){
        this.width=w;
        this.height=h;
    }



    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник");
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    public static void main(String [] args) {
        Shape ob = new Rectangle(12.2, 12.2);
        ob.getArea();
    }
}