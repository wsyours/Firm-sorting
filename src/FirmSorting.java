import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Сергей on 20.01.2017.
 */
public class FirmSorting {

   public static void main(String[] args) {
      ArrayList<Employee> list = new ArrayList<>();
      Employee director = new Director("Director", "Anna", "Petrova", 34, false, 150000);

      Employee seller1 = new Seller("Seller", "Petr", "Feofanov", 29, true, 50000);
      Employee seller2 = new Seller("Seller", "Maria", "Petrova", 25, false, 45000);
      Employee seller3 = new Seller("Seller", "Sergey", "Tretyakov", 28, true, 60000);
      Employee seller4 = new Seller("Seller", "Andrey", "Fedorov", 33, true, 55000);
      Employee seller5 = new Seller("Seller", "Ksenia", "Aristova", 22, false, 35000);

      Employee seniorAccountant = new Accountant("Accountant", "Pavel", "Martinov", 45, true, 70000);
      Employee juniorAccountant = new Accountant("Accountant", "Olga", "Kuzina", 55, false, 75000);

      Employee driver1 = new Driver("Driver", "Igor", "Pavlov", 50, true, 40000);
      Employee driver2 = new Driver("Driver", "Evegeniy", "Tereshenko", 44, true, 40000);
      Employee driver3 = new Driver("Driver", "Oleg", "Protassov", 42, true, 45000);

      Employee engineer = new Engineer("Engineer", "Vladimir", "Kulibin", 35, true, 65000);

      list.add(director);
      list.add(seller1);
      list.add(seller2);
      list.add(seller3);
      list.add(seller4);
      list.add(seller5);
      list.add(seniorAccountant);
      list.add(juniorAccountant);
      list.add(driver1);
      list.add(driver2);
      list.add(driver3);
      list.add(engineer);

      System.out.println("Initial list :");

      System.out.println();

      printList(list);

      System.out.println();

      Collections.sort(list,new Employee.SortByName());

      System.out.println("Sorted by lastname :");

      System.out.println();

      printList(list);

      System.out.println();

      Collections.sort(list,new Employee.SortBySalary());

      System.out.println("Sorted by salary :");

      System.out.println();

      printList(list);

   }

   private static void printList(ArrayList<Employee> list)
   {
      for (Employee b : list)
      {
         System.out.println("Position: " + b.getPosition() + " " + "Firstname: " + b.getFirstName() + " "
                 + "Lastname: " + b.getLastName() + " " + "age: " + b.getAge() + " "
                 + "sex: " + b.getSex() + " " + "Salary, RUB: " + b.getSalary());
      }
   }
}
