public class Bank  {
    private int balance=1000;
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new InsufficientBalance("Not Enough Balance");
        }else{
            balance = amount;
            System.out.println("Withdraw Successful"+balance);
        }
    }
}
