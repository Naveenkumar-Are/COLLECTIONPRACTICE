import java.util.*;

public class EmployeeComparable implements Comparable<EmployeeComparable>
{
    int id;
    String name;


    int age;

    public EmployeeComparable(int id, String name, int age)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Employee [id= ." + id + ", name=" + name + ", age=" + age + "]";
    }

    public int compareTo(EmployeeComparable ref)
    {
        if(this.age>ref.age)
            return 1;
        else
            return -1;
    }
}
public class LaunchComplexSorting2
{

    public static void main(String[] args)
    {

        EmployeeComparable emp1=new EmployeeComparable(3, "Rohan", 18);
        //System.out.println(emp1);

        EmployeeComparable emp2=new EmployeeComparable(2, "Vishal", 15);
        //System.out.println(emp2);

        EmployeeComparable emp3=new EmployeeComparable(4, "Mehu", 16);
        //System.out.println(emp3);

        //System.out.println(10);

        List<EmployeeComparable> list=new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sort : "+list);
        Collections.sort(list);
        System.out.println("After sort : "+list);

        //Lambda practice

        List<Integer> b= Arrays.asList(1,23,4,5566,78);

        b.forEach(i->System.out.println(i));
    }

}