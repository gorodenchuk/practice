package interfaceLearning;

import interfaceLearning.Shape;
import interfaceLearning.subPackage.SuperShape2;

import java.awt.*;

/**
 * Created by gorod on 12.09.2017.
 */
// класс Круг(Circle) реализует интерфейс Форма(Shape)
public class Circle extends ShapeTest implements Shape, SuperShape2, SuperShape {

    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем Круг");
    }

    @Override
    public double getArea(){
        // Вычисляем площадь
        return Math.PI*this.radius*this.radius;
    }

    public double getRadius(){
        return this.radius;
    }
}
