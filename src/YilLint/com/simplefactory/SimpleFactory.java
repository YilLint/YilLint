package YilLint.com.simplefactory;

import YilLint.com.bll.AddOperation;
import YilLint.com.bll.IOperation;
import YilLint.com.bll.SubOperation;

public class SimpleFactory {
     private IOperation opr = null;
    public IOperation getOperation(String oprType) throws Exception{
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
       return opr;
    }
}
