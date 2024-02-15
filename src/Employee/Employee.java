package Employee;
//Write a Java program to create a class called Employee with methods called work() and getSalary().
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee()
public class Employee {

    public String name;
    public String salary;
    public String work;

   public Employee(){
       name="Undefined";
       salary="Minim";
       work="Undefined";
   }

   public Employee(String name){
       this.name=name;
       salary="Minim + bonusul lunar";
       work="Level 1";
   }

   public Employee(String name, String salary){
       this.name=name;
       this.salary=salary;
       work="Level 2";
   }

   public Employee(String name,String salary,String work){
       this.name=name;
       this.salary=salary;
       this.work=work;
   }

   void work(){
       System.out.println("Nivelul de munca al angajatului cu numele "+name+" este: "+work);
   }

       void getSalary(){
           System.out.println("Salariul acestui angajat este: "+salary);
       }
}
