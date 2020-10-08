package YilLint.com.ui;
/*1000以内加减法*/
import YilLint.com.bll.*;
import YilLint.com.simplefactory.SimpleFactory;

import java.util.Scanner;

public class ui {
    public static void main(String[] args ) throws Exception {
        int numberA, numberB,result;
        String oprType;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数:");
        numberA = scanner.nextInt();
        System.out.println("输入第二个数:");
        numberB = scanner.nextInt();
        System.out.println("输入运算符:");
        oprType = scanner.next();

        IOperation opr = null;
        SimpleFactory factory=null;

        /*switch (oprType){
            case "+":
                opr = new AddOperation();
                break;
            case "-":
                opr = new SubOperation();
                break;
            default:
                throw new Exception("输入的运算符号错误！");
        }*/
        //实例化简单工厂对象
        factory=new SimpleFactory();
        //生产运算类对象
        opr=factory.getOperation(oprType);

        opr.setValue(numberA,numberB);
        result=opr.getResult();

        System.out.println(result);
    }
}
