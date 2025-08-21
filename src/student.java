public abstract class student {
    public int rollno;
    public String name;
//    private String banking_pass;
    student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;

    }
    abstract void attend_class();
    abstract void give_exam();
        void register(){
            System.out.println("Name is"+name+"is registered with rollno "+rollno);
        }



}
