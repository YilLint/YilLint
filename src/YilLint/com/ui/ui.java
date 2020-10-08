package YilLint.com.ui;
/*1000以内加减法*/
import YilLint.com.bll.*;
import java.util.Scanner;

public class ui {
    public static void main(String[] args ) throws Exception {
        int numberA, numberB,result;
        String oprType;
        Scanner scanner = new Scanner(System.in);
        numberA = scanner.nextInt();
        numberB = scanner.nextInt();
        oprType = scanner.next();
        IOperation opr = new Operation();
        opr.setValue(numberA,numberB);
        switch (oprType){
            case "+":
                result = opr.add();
                break;
            case "-":
                result = opr.add();
                break;
            default:
                result = -9999999;
                break;
        }
        System.out.println(result);
    }
}
