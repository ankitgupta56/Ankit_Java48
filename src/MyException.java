public class MyException {
    public static void main(String[] args) {
        UserDefineException udfe = new UserDefineException();
        try
        {
            udfe.validate(12);
            udfe.validate(19);
        }catch (InvalidAge e){
            System.out.println(e.getMessage());
        }
    }
}
