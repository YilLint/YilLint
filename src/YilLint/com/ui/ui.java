package YilLint.com.ui;
/*1000以内加减法*/
import YilLint.com.bll.*;
import YilLint.com.factory.AddFactory;
import YilLint.com.factory.IFactory;
import YilLint.com.factory.MulFactory;
import YilLint.com.factory.SubFactory;
import YilLint.com.simplefactory.SimpleFactory;
import java.util.Scanner;


class Funs<T extends Number> {
    public void commonCalculate(T numberA, T numberB, String oprType) throws Exception {
        IOperation<T> opr = null;
        IFactory<T> factory = null;
        T result;
        //根据运算符号去实例化工厂对象
        switch (oprType) {
            case "+":
                factory = new AddFactory<T>();
                break;
            case "-":
                factory = new SubFactory<T>();
                break;
            default:
                throw new Exception("输入的运算符号错误！");
        }
        //生产运算类对象
        opr = factory.getOperation();
        opr.setValue(numberA, numberB);
        result = opr.getResult();
        System.out.println(result);
    }

    public void FloatCalculate() throws Exception {
        float numberA, numberB, result;
        String oprType;
        Scanner scanner = new Scanner(System.in);
        numberA = scanner.nextFloat();
        numberB = scanner.nextFloat();
        oprType = scanner.next();
        IOperation<Float> opr = null;
        IFactory<Float> factory = null;
        //根据运算符号去实例化工厂对象
        switch (oprType) {
            case "+":
                factory = new AddFactory<Float>();
                break;
            case "-":
                factory = new SubFactory<>();
                break;
            default:
                throw new Exception("输入的运算符号错误！");
        }
        //生产运算类对象
        opr = factory.getOperation();
        opr.setValue(numberA, numberB);
        result = opr.getResult();
        System.out.println(result);
    }
}


public class ui {
    public static void main(String[] args) throws Exception {
        /*整型加法*/
        Integer numberA, numberB;
        String oprType;
        Scanner scanner = new Scanner(System.in);
        numberA = scanner.nextInt();
        numberB = scanner.nextInt();
        oprType = scanner.next();
        Funs<Integer> funs = new Funs<>();
        funs.commonCalculate(numberA, numberB, oprType);

        Double numberDA,numberDB;
        numberDA=scanner.nextDouble();
        numberDB = scanner.nextDouble();
        new Funs<Double>().commonCalculate(numberDA, numberDB, oprType);
        new Funs<Float>().FloatCalculate();
    }
}
