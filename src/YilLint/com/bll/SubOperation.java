package YilLint.com.bll;

public class SubOperation<T extends Number> extends Operation<T>{
    @Override
    public T getResult() {
        Class<?> type =a.getClass();
        if (type == Integer.class) {
            return (T) new Integer(a.intValue() - b.intValue());
        } else if (type == Float.class) {
            return (T) new Float(a.floatValue() - b.floatValue());
        } else {
            return (T) new Double(a.doubleValue() - b.doubleValue());
        }
    }
}
