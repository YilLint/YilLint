package YilLint.com.factory;

import YilLint.com.bll.IOperation;

public interface IFactory <T extends Number>{
    IOperation <T>getOperation();
}
