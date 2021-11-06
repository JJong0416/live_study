package io;

import java.io.*;

public class ioTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader("input.txt"));
            pw = new PrintWriter(new FileWriter("output.txt"));

            String s;
            while ((s = br.readLine()) != null){
                pw.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (br != null){
                br.close();
            }
            if (pw != null){
                pw.close();
            }
        }
    }
}
