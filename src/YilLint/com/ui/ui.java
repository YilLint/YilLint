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
        IOperation opr = null;
        switch (oprType){
            case "+":
                opr = new AddOperation();
                break;
            case "-":
                opr = new SubOperation();
                break;
            default:
                throw new Exception("输入的运算符号错误！");
        }
        opr.setValue(numberA,numberB);
        result=opr.getResult();
        System.out.println(result);
    }
}
