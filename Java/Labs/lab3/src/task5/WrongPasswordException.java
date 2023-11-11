package task5;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
        System.out.println("Wrong pssword exception");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
