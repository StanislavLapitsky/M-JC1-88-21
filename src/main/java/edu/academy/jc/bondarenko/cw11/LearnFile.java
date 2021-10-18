package edu.academy.jc.bondarenko.cw11;

import java.io.*;

public class LearnFile {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("D:\\Java courses\\prictice\\M-JC1-88-21-all\\src\\main\\java\\edu\\academy\\jc\\bondarenko\\cw11\\listofPack.txt")) {
            File folder = new File("c:");
            for (File file : folder.listFiles()) {
                fileWriter.write(file.getAbsolutePath());
                fileWriter.append('\n');
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File file = new File("D:\\Java courses\\prictice\\M-JC1-88-21-all\\src\\main\\java\\edu\\academy\\jc\\bondarenko\\cw11\\listofPack.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            int res=0;
            String line = reader.readLine();
            while (line != null) {
                res+=getNumberA(line);
                line = reader.readLine();
            }
            System.out.println(res);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static int getNumberA(String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++)
            if (sb.charAt(i) == 'a' || sb.charAt(i)=='A')
                counter++;
        return counter;
    }
}
