package exception;

import java.io.File;
import java.io.IOException;

public class checkedException {
    public static void throwsException(int millisecond) throws IOException {
        File file = new File("/test.txt");
        boolean b = file.createNewFile();
    }
}
