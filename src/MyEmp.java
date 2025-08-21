public class MyEmp {
    static {
        System.out.println("MyEmp static block");
    }
    public static void main(String[] args) {
//        Employee e1=new Employee(500,"Ankit",48);
//                e1.display();
        Employee.emp_info();
    }

}
