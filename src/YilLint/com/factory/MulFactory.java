package YilLint.com.factory;

import YilLint.com.bll.IOperation;
import YilLint.com.bll.MulOperation;
import YilLint.com.bll.SubOperation;

public class MulFactory implements IFactory{
    public IOperation getOperation(){
        return new MulOperation();
    }
}
