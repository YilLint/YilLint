package YilLint.com.factory;

import YilLint.com.bll.AddOperation;
import YilLint.com.bll.IOperation;

public class AddFactory implements IFactory{
    public IOperation getOperation(){
        return new AddOperation();
    }
}
