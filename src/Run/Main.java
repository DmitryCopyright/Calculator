package Run;

import Exceptions.OperationException;
import Exceptions.ValueException;
import Utility.Oper;
import Utility.RomeNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите числа:");
        Scanner scanner = new Scanner(System.in);
        String val1 = scanner.next();
        final String operation = scanner.next();
        String val2 = scanner.next();
        try {
            if ((RomeNumbers.romeToInteger(val1) == 0) && (RomeNumbers.romeToInteger(val2) == 0)) {
                System.out.println(Oper.result(Integer.parseInt(val1), Integer.parseInt(val2), operation));
            } else {
                System.out.println(RomeNumbers.intToRome(Oper.result(RomeNumbers.romeToInteger(val1), RomeNumbers.romeToInteger(val2), operation)));
            }
        }
        catch (ValueException valException){
            System.out.println("Числа неверны!");
        }
        catch (OperationException operException){
            System.out.println("Операция не верна!");
        }



    }


}

