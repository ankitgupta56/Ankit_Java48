public class MyBank {
    public static void main(String[] args) {
        Bank b=new Bank();
        try{
            b.withdraw(500);
        }catch(InsufficientBalance e){
            System.out.println(e.getMessage());
        }
    }
}
