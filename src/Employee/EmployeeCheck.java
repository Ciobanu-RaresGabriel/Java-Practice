package Employee;

public class EmployeeCheck {
    public static void main(String[] args) {

        Employee ana = new Employee();
        Employee andrei = new Employee("Marian");
        Employee maria = new Employee("Ioana", "medium");
        Employee matilda = new Employee("Pascal", "medium + bonus de performanta", "Level 3");

        System.out.println("Name: "+ana.name+ "\t\tSalary: "+ana.salary+"\t\tWork: "+ana.work);
        System.out.println("Name: "+andrei.name+ "\t\tSalary: "+andrei.salary+"\t\tWork: "+andrei.work);
        System.out.println("Name: "+maria.name+ "\t\tSalary: "+maria.salary+"\t\tWork: "+maria.work);
        System.out.println("Name: "+matilda.name+ "\t\tSalary: "+matilda.salary+"\t\tWork: "+matilda.work);

        maria.work();
        HRManager felix=new HRManager();
        felix.work();
        HRManager.addEmployee("Valentin","22 septembrie");

    }
}
