import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmpMain {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ram", 200000));
        list.add(new Employee(2, "Shyam", 430000));
        list.add(new Employee(3, "Hari", 400000));
        list.add(new Employee(4, "Sita", 300000));
        list.add(new Employee(5, "Gita", 200000));
    }

}
