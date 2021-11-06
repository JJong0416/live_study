package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferTest {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
