package YilLint.com.factory;

import YilLint.com.bll.AddOperation;
import YilLint.com.bll.IOperation;
import YilLint.com.bll.SubOperation;

public class SubFactory implements IFactory{
    public IOperation getOperation(){
        return new SubOperation();
    }
}
