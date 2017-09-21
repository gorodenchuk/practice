package abstractionLearning;

/**
 * Created by gorod on 12.09.2017.
 */
public class Employee extends Person {

    private int empId;

    public Employee(String nm, String gen, int id) {
        super(nm, gen);
        this.empId=id;
    }

    @Override
    public void work() {
        if(empId == 0){
            System.out.println("Безработный");
        }else{
            System.out.println("Работник по найму");
        }
    }

    public static void main(String args[]){

        Person student = new Employee("Andrew","Male", 0);
        Person employee = new Employee("Alesya","Female", 1);

        // вызываем переопределенные методы
        student.work();
        employee.work();

    }

}