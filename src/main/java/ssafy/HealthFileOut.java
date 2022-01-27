package ssafy;

import java.io.*;

public class HealthFileOut {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\82108\\Desktop\\개인공부\\git_Task\\src\\main\\java\\ssafy\\hw8.txt");

        if (file.exists()){
            BufferedReader inFile = new BufferedReader(new FileReader(file));
            String sLine = null;

            while((sLine = inFile.readLine()) != null) {
                System.out.println(sLine);
            }
        }
    }
}
