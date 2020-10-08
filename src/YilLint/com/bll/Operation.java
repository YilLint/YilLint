package YilLint.com.bll;

public abstract class Operation implements IOperation {
    protected int a;
    protected int b;

    public void setValue(int a, int b) throws Exception {
        /*先进行数据合法性检查*/
        if (a > 1000 || b > 1000) {
            throw new Exception("数据范围超限制！");
        } else {
            this.a=a;
            this.b=b;
        }
    }
}
