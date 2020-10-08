package YilLint.com.ui;
/*1000以内加减法*/
import YilLint.com.bll.*;
import YilLint.com.factory.AddFactory;
import YilLint.com.factory.IFactory;
import YilLint.com.factory.MulFactory;
import YilLint.com.factory.SubFactory;
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
        IFactory factory=null;

        //根据运算符号去实例化工厂对象
        switch (oprType){
            case "+":
                factory = new AddFactory();
                break;
            case "-":
                factory = new SubFactory();
                break;
            case "*":
                factory = new MulFactory();
                break;
            default:
                throw new Exception("输入的运算符号错误！");
        }

        //生产运算类对象
        opr=factory.getOperation();

        opr.setValue(numberA,numberB);
        result=opr.getResult();
        System.out.println(result);
    }
}
