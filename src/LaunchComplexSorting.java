import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{

   public int age;
   public String name;
   public int id;

    public Employee(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name=.'" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
class Alpha implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.age< o2.age) {
            return 0;
        } else
            return -1;
    }
}

public class LaunchComplexSorting {



    public static void main(String[] args) {

        Employee emp1 = new Employee(22, "Krishna", 1);
        System.out.println(emp1);

        Employee emp2 = new Employee(23, "Ravi", 3);
        System.out.println(emp2);

        Employee emp3 = new Employee(22, "Naveen", 2);
        System.out.println(emp3);


        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("before sort" + list);


        Alpha alpha = new Alpha();
        Collections.sort(list, alpha);
        System.out.println("After sort" + list);

        // Using Comparator anonymous

        Comparator<Employee> sorting = (o1, o2) -> {
            if (o1.age < o2.age) {
                return 1;
            } else {
                return -1;
            }
        };
        Collections.sort(list,sorting);
        System.out.println("After sort" + list);
    }


}
