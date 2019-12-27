package special.exception;

public class ExceptionTest {

    public static void main(String[] args) throws MyException {
        throw new MyException("New exception");
    }
}
