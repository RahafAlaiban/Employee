import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.Arrays.asList;

public class Company {
    private String companyName;
    private Map<Integer, Employee> employee = new HashMap<>();
    public static Manager[] managers = new Manager[10];
    List<String> list = asList("Test");

    public Company() {
    }

    public Map<Integer, Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Map<Integer, Employee> employee) {
        this.employee = employee;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }

    public static void printManagers() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Manager manager : managers) {
            stringBuilder.append(manager.getName()).append(" ").append(manager.getId())
                    .append(" ").append(manager.getDepartment()).append(" ").append(manager.getSalary()).append(" ").append(manager.getBonus()).append("\n");
        }
        System.out.println(stringBuilder.toString());
    }


    public void searchManager(int counter) {
        printAllEmployees();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < managers.length; i++) {
            if (i == counter) {
                printManagers();
            }
        }
    }
    public void printAllEmployees() {
        for (Integer key : employee.keySet()) {
            System.out.println(key.toString() + " " + employee.get(key).getName() + " " + employee.get(key).getId());
        }
    }

    public void searchEmployee(int counter) {
        System.out.println(employee.get(counter).getName());
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public void numOfOccurrence(int[] arr) {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] > 0)
                arr2[arr[i]]++;
        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]>0){
            System.out.println("Number of" + arr[i] + " = " + arr2[i]);
        }}
    }

    public void checkUpperCase(String string) {
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < string.length(); i++) {
            char str = string.charAt(i);
            if (str >= 'A' && str <= 'Z'){
                upper++;}
            else if (str >= 'a' && str <= 'z') {
                lower++;
            }
        }
        System.out.println("Num of Lower " + lower);
        System.out.println("Num of Upper " + upper);
    }

    public void countNumbers(int [] arr){
        int pos=0;
        int neg=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=0)
                pos++;
            else neg++;
        }
        System.out.println("Number of Positive numbers "+ pos);
        System.out.println("Number of Negative numbers "+ neg);
    }

    public void patterns1(int num){
        for (int i=0;i<num;i++){
            int k=1;
            for (int j=0;j<=i;j++){
                System.out.print(k);
                k++;
           }
            System.out.println(" ");
        }}
    public void patterns2(int num){
        for (int i=num;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }}


    public void patterns3(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }

    public void patterns4(int num){
        for (int i=1;i<=num;i++){
            for (int j=0;j<=num;j++){
                System.out.print(" ");
            }
            for (int k=num;k>=i;k--){
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }





}