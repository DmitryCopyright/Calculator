package Utility;

public enum RomeNumbers {
    I(1, "I"),
    IV(4, "IV"),
    V(5, "V"),
    IX(9, "IX"),
    X(10, "X"),
    XL(40, "XL"),
    L(50,"L"),
    XC(90, "XC"),
    C(100,"C"),
    CD(400, "CD"),
    D(500,"D"),
    CM(900, "CM"),
    M(1000,"M");


    private final int num;
    private final String i;



    RomeNumbers(int num, String i) {
        this.num = num;
        this.i = i;
    }

    public String getRomeNum() {
        return i;
    }

    private static String getRomeNumWithInt(int num) {
        RomeNumbers rN[] = RomeNumbers.values();
        for (int i = 0; i < rN.length; i++) {
            if(rN[i].getNum() == num){
                return rN[i].getRomeNum();
            }
        }
        return null;
    }

    public int getNum() {
        return num;
    }
    private static int getNumWithChar(String romeNum) {
        RomeNumbers rN[] = RomeNumbers.values();
        for (int j = 0; j < rN.length ; j++) {
            if (rN[j].getRomeNum().equals(romeNum)){
                return rN[j].getNum();
            }
        }
        return 0;
    }


    public static int romeToInteger(String num){
        RomeNumbers rN[] = RomeNumbers.values();
        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            if(i == 0 || RomeNumbers.getNumWithChar(String.valueOf(num.charAt(i))) <= RomeNumbers.getNumWithChar(String.valueOf(num.charAt(i-1)))) {
                result += RomeNumbers.getNumWithChar(String.valueOf(num.charAt(i)));
            } else {
                result += RomeNumbers.getNumWithChar(String.valueOf(num.charAt(i))) - 2 * RomeNumbers.getNumWithChar(String.valueOf(num.charAt(i-1)));
            }
        }
        return result;
    }

    public static String intToRome(int input) {
        if (input < 1 || input > 3999)
            return "Введенное число неверно!";
        String s = "";
        while (input >= 1000) {
            s += RomeNumbers.M.getRomeNum();
            input -= 1000;        }
        while (input >= 900) {
            s += RomeNumbers.CM.getRomeNum();
            input -= 900;
        }
        while (input >= 500) {
            s += RomeNumbers.D.getRomeNum();
            input -= 500;
        }
        while (input >= 400) {
            s += RomeNumbers.CD.getRomeNum();
            input -= 400;
        }
        while (input >= 100) {
            s += RomeNumbers.C.getRomeNum();
            input -= 100;
        }
        while (input >= 90) {
            s += RomeNumbers.XC.getRomeNum();
            input -= 90;
        }
        while (input >= 50) {
            s += RomeNumbers.L.getRomeNum();
            input -= 50;
        }
        while (input >= 40) {
            s += RomeNumbers.XL.getRomeNum();
            input -= 40;
        }
        while (input >= 10) {
            s += RomeNumbers.X.getRomeNum();;
            input -= 10;
        }
        while (input >= 9) {
            s += RomeNumbers.IX.getRomeNum();;
            input -= 9;
        }
        while (input >= 5) {
            s += RomeNumbers.V.getRomeNum();;
            input -= 5;
        }
        while (input >= 4) {
            s += RomeNumbers.IV.getRomeNum();;
            input -= 4;
        }
        while (input >= 1) {
            s += RomeNumbers.I.getRomeNum();;
            input -= 1;
        }
        return s;
    }
}
