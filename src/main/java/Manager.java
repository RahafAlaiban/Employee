public class Manager extends Employee {
   public double bonus;

   public Manager(String name, int id, String department, double salary, double bonus){
       super(name, id, department, salary);
       this.bonus=bonus;
   }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
