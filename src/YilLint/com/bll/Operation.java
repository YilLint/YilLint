package YilLint.com.bll;

public class Operation implements IOperation {
    private int a;
    private int b;

    public void setValue(int a,int b) throws Exception {
        /*先进行数据合法性检查*/
        if (a > 1000 || b > 1000) {
            throw new Exception("数据范围超限制！");
        } else {
            this.a=a;
            this.b=b;
        }
    }
    @Override
    public int add() {
        return a + b;
    }

    @Override
    public int sub() {
        return a - b;
    }
}
