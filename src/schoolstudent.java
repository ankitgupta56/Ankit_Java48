public class schoolstudent extends student {
    schoolstudent(int rollno,String name) {
        super(rollno,name);
    }
    public void attend_class(){
        System.out.println(name+" is attending class");
    }
    public void give_exam(){
        System.out.println(name+" is giving exam");
    }

}
