package YilLint.com.bll;

import java.nio.file.OpenOption;

public class AddOperation<T extends Number> extends Operation<T> {
    @Override
    public T getResult() {
        Class<?> type = a.getClass();
        if (type == Integer.class){
            return (T)new Integer(a.intValue() + b.intValue());
        }else if(type == Float.class){
            return (T)new Integer(a.intValue() + b.intValue());
        }else {
            return (T)new Integer(a.intValue() + b.intValue());
        }
    }
}
