package Utility;
import Exceptions.OperationException;
import Exceptions.ValueException;

public class Oper {

    public static int result(int value1, int value2, String operation) throws OperationException, ValueException {
        if((value1 < 1) || (value1 > 10) || (value2 < 1) || (value2 > 10)) {
            throw new ValueException();
        }
        int result = 0;
        switch (operation) {
            case ("+"):
                result = Calculator.sum(value1, value2);
                break;
            case ("-"):
                result = Calculator.razn(value1, value2);
                break;
            case ("*"):
                result = Calculator.proizv(value1, value2);
                break;
            case ("/"):
                result = Calculator.del(value1, value2);
                break;
            default:
                throw new OperationException();

        }
        return result;
    }
}