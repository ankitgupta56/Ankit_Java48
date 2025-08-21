public class Myinterface implements Printtable{
    public void print(){
        System.out.println("I am print");
    }
    public void show(){
        System.out.println("I am say");
    }
    public static void main(String[] args){
        Myinterface myinterface = new Myinterface();
        myinterface.print();
    }
}
