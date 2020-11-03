package YilLint.com.factory;

import YilLint.com.bll.AddOperation;
import YilLint.com.bll.IOperation;
import YilLint.com.bll.SubOperation;

public class SubFactory<T extends Number> implements IFactory{
    @Override
    public IOperation<T> getOperation(){
        return new SubOperation();
    }
}
