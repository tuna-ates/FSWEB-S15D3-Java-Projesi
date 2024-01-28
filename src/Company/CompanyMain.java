package Company;

import java.util.*;

public class CompanyMain {
    public static void main(String[] args) {
        List<Employee> employeeList=new LinkedList<>();
        employeeList.add(new Employee(1,"tuna","ates"));
        employeeList.add(new Employee(1,"tuna","ates"));

        employeeList.add(new Employee(2,"buse","ates"));
        employeeList.add(new Employee(2,"buse","ates"));

        employeeList.add(new Employee(3,"ayse","ates"));
        employeeList.add(new Employee(3,"ayse","ates"));

        employeeList.add(new Employee(4,"fatma","ates"));
        employeeList.add(new Employee(5,"ali","ates"));

        Map<Integer,Employee> employeeMap=new HashMap<>();
        List<Employee> removedEmployee=new ArrayList<>();

        System.out.println("Mevcut");
        System.out.println(employeeList);



        Iterator<Employee> iterator= employeeList.iterator();
        while (iterator.hasNext()){
            Employee employee=iterator.next();
            if (employee==null){
                System.out.println("öge boş");
               continue;
            }if (employeeMap.containsKey(employee.getId())){
                removedEmployee.add(employee);
                iterator.remove();
            }else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println("tekiller");
        System.out.println(employeeMap);
        System.out.println("silinenler");
        System.out.println(removedEmployee);

    }
}
