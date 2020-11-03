package YilLint.com.bll;

public interface IOperation <T extends Number>{

    T getResult();

    void setValue(T a, T b) throws Exception;
}
