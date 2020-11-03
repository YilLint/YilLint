package YilLint.com.bll;

public abstract class Operation<T extends Number> implements IOperation <T> {
    protected T a;
    protected T b;

    @Override
    public void setValue(T a, T b) throws Exception {
        /*先进行数据合法性检查*/
        Class<?> type = a.getClass();
        Integer tia,tib;
        Float tfa,tfb;
        Double tda,tdb;
        if(type == Integer.class){
            tia = a.intValue();
            tib = b.intValue();
            if (tia > 1000 || tib > 1000) {
                throw new Exception("数据范围超限制！");
            }
        }else if(type == Float.class){
            tfa = a.floatValue();
            tfb = b.floatValue();
            if (tfa > 1000 || tfb > 1000) {
                throw new Exception("数据范围超限制！");
            }
        }else if(type == Double.class){
            tda = a.doubleValue();
            tdb = b.doubleValue();
            if (tda > 1000 || tdb > 1000) {
                throw new Exception("数据范围超限制！");
            }
        }

        this.a=a;
        this.b=b;
    }
}
