package task5;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        System.out.println("Wrong login exception");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

