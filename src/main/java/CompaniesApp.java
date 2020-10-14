import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CompaniesApp {

    public static int newNumber(int num){
       return num=8;
    }


    public static int number (int number){
        number++;
        return number;
    }
    public static String letters(String letters){
        letters+="d";
        return letters;
    }
    public static void main(String[] args) {
        int number =1;
        String letters = "abc";
        number(number);
        letters=letters(letters);
        System.out.println(number + " "+ letters);




        int num = 4;
        System.out.println("Number is "+ newNumber(num));
      Company company;
      Map<Integer, Employee> employeeMap = new HashMap<>();
      Manager [] manager = new Manager[2];

      Employee emp = new Employee("Sara",1, "PMO", 10000);
      Employee emp2 = new Employee("Yara",2, "IT", 10500);
      Employee emp3 = new Employee("Shahad",3, "IT", 10500);
      employeeMap.put(0,emp);
      employeeMap.put(1,emp2);
      employeeMap.put(2,emp3);

      company = new Company();
      company.setCompanyName("Tech Company");
      company.setEmployee(employeeMap);

      manager[0]= new Manager ("Asma",4, "IT", 10500, 500);
      manager[1]= new Manager ("Kayan",5, "PMO", 11500, 500);

      company.setManagers(manager);
      Company.printManagers();
      company.printAllEmployees();
      company.searchEmployee(1);
      company.searchManager(1);

     int [] arr = {1,2,3,4,5,6,7,8,2};
     // company.numOfOccurrence(arr);

      company.checkUpperCase("Rahaf Alaiban");
      company.countNumbers(arr);
      System.out.println("A");
     // company.patterns1(5);
      System.out.println("B");
     // company.patterns2(5);
      System.out.println("C");
     // company.patterns3(5);
      System.out.println("D");
     // company.patterns4(5);

        Supplier<Map<String, String>> supplier = HashMap::new;
        Map<String, String> map = supplier.get();

        Supplier employee = ()-> new Employee("Rahaf", 1234, "IT", 50000);
        employee.get();

        Supplier<Integer> randomNumber=()-> new Random().nextInt(10);
        Stream.generate(randomNumber).limit(4).forEach(System.out::println);
        Supplier<Double> randomNumber2=()-> Math.random();
        System.out.println(randomNumber2.get());




        Predicate<String> predicate = s -> s.length() > 5;
        Predicate<String> predicate2 = s -> s.length() < 10;
        Predicate<String> finalExample = predicate.or(predicate2);
        System.out.println(predicate.test("Hassan"));
        System.out.println(predicate.test("Hassa"));
        System.out.println(finalExample.test("Hassan444444"));

        Consumer<List> stringConsumer = (s)->{
            s.add(1);
            s.add(2);
        };

        Consumer<String> stringConsumer1 = System.out::println;
        stringConsumer1.accept("Test");



    }
}
