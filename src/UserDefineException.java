public class UserDefineException {
    public void validate(int age)throws InvalidAge{
        if(age<18)
            throw new InvalidAge("NOt eligible");
        else
            System.out.println(" eligible");
    }
}
