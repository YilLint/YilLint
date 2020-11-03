package YilLint.com.factory;

import YilLint.com.bll.AddOperation;
import YilLint.com.bll.IOperation;

public class AddFactory<T extends Number> implements IFactory{
    @Override
    public IOperation<T> getOperation(){
        return new AddOperation();
    }
}
