package YilLint.com.factory;

import YilLint.com.bll.IOperation;
import YilLint.com.bll.MulOperation;
import YilLint.com.bll.SubOperation;

public class MulFactory<T extends Number> implements IFactory{
    @Override
    public IOperation<T> getOperation(){
        return new MulOperation();
    }
}
