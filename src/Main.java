//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Admin curAdmin = new Admin(1234, "Stephan", "xa1@LW42%3");// instantiation
        User curUser = new User(4455, "John");
        curAdmin.performOperation(new Update()); // Admin Updates the data.
        curUser.performOperation(new View()); // User can view the data.
    }
}