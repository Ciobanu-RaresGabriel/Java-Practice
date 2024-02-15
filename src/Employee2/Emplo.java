package Employee2;
//Write a Java program to create a class called "Employee"
// with a name, salary, and hire date attributes, and a method to calculate years of service.


import FabricaDeMasini.Masina;

public class Emplo extends Masina implements EmplDate{
    public String name;
    private int salary;
    public String date;

    public Emplo(){
        super();
       String name="Andrei";
    }

    public Emplo(String name, String date){
        super("Diesel");
        this.name=name;
        this.date=date;
    }



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

public void display()
{
    System.out.println(super.getTipMotorizare()+"\t"+super.an);
}
    @Override
    public int period(String currentYear) {
        String startJob=date.split("-")[1];
        System.out.println(super.getCuloare());
        return Integer.parseInt(currentYear)-Integer.parseInt(startJob);
    }

    public static void main(String[] args) {
        Emplo radu=new Emplo("andrei","09-2020");
        System.out.println( radu.period("2024"));
        radu.display();

    }
}
