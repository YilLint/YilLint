package YilLint.com.bll;

import java.nio.file.OpenOption;

public class AddOperation extends Operation {
    @Override
    public int getResult() {
        return a + b;
    }
}
