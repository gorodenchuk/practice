package abstractionLearning;

/**
 * Created by gorod on 12.09.2017.
 */
//абстрактный класс
public abstract class Person {

    private String name;
    private String gender;

    public Person(String nm, String gen){
        this.name=nm;
        this.gender=gen;
    }

    //абстрактный метод
    public abstract void work();

    @Override
    public String toString(){
        return "Имя: " + this.name + "Пол: " + this.gender;
    }

}
