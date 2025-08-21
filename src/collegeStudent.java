public class collegeStudent extends student1 {
    public int rollno;

    public collegeStudent(String address, int rollno1) {
        super(address);
        this.rollno = rollno1;
    }
    public void showrollno() {
        System.out.println("roll no is " + rollno);
    }
}
