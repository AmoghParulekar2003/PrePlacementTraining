import java.util.Scanner;

class InvalidUsernamePasswordException extends Exception{
    public InvalidUsernamePasswordException() {
        System.out.println("Invalid Username or Password");
    }
}
class P6 {
    static void status(String username, String password) throws InvalidUsernamePasswordException {
        if ("abcd".equals(username) && "1234".equals(password)) {
            System.out.println("welcome");
        } else {
            throw new InvalidUsernamePasswordException();
        }
    }
    public static void main(String[] args) throws InvalidUsernamePasswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter Password: ");
        String password = sc.next();
        P6.status(username, password);
    }
}
