package YilLint.com.bll;

public interface IOperation {
    int add();
    public abstract int sub();

    void setValue(int a, int b) throws Exception;
}
