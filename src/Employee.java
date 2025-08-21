public class Employee
{
    int emp_id;
    String emp_name;
    double emp_salary;
    static String emp_org="TCS";

    public Employee(double emp_salary, String emp_name, int emp_id) {
        this.emp_salary = emp_salary;
        this.emp_name = emp_name;
        this.emp_id = emp_id;
    }

    public void display()
    {
        System.out.println("EMP ID: "+emp_id);
        System.out.println("EMP NAME: "+emp_name);
        System.out.println("EMP SALARY: "+emp_salary);
    }

    public static void emp_info() {
        System.out.println(emp_org);

    }
}
