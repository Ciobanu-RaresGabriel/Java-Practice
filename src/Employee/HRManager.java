package Employee;

public class HRManager extends Employee{

    public HRManager() {
        super();
    }
    public void work(){
        System.out.println("Angajatul "+name+" lucreaza in departamentul HR.");
    }
    public static void addEmployee(String nume, String data){
        System.out.println("Noul angajat pe nume "+nume+" va incepe munca pe data de: "+data);

    }
}
