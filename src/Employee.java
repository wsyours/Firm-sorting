import java.util.Comparator;

/**
 * Created by Сергей on 20.01.2017.
 */
class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private boolean sex;
    private int salary;
    private String position;

     Employee(String position, String firstName,String lastName,int age,boolean sex,int salary)
    {
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.salary=salary;
    }
    String getPosition()
    {
        return this.position;
    }

     String getFirstName()
    {
        return this.firstName;
    }
     String getLastName()
    {
        return this.lastName;
    }
     int getSalary()
    {
        return this.salary;
    }
     int getAge(){
        return this.age;
    }
     String getSex(){
        if(sex)
        {
            return "male";
        }
        else return "female";
    }
     static class SortByName implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e) {
            return (int) e1.getLastName().compareTo(e.getLastName());
        }
    }

     static class SortBySalary implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e) {
            return e.getSalary() - e1.getSalary();
        }

    }
}
