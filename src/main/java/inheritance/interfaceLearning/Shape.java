package inheritance.interfaceLearning;

import inheritance.interfaceLearning.subPackage.SuperShape2;

/**
 * Created by gorod on 12.09.2017.
 */
public interface Shape extends SuperShape, SuperShape2 {

    //неявно public, static и final
    public String LABLE="Shape";

    //методы интерфейса неявно abstract и public
    void draw();

    double getArea();
}