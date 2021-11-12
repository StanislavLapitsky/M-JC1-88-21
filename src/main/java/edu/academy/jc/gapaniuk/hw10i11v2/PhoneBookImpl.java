package edu.academy.jc.gapaniuk.hw10i11v2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class PhoneBookImpl implements PhoneBook{
     public Map<Integer,String> setOfMyPB = new HashMap<Integer,String>();
     public String pathToFileWithPB = "";
     public File fileWithPB = null;

    @Override
    public void addUser(int number, String name) {
      setOfMyPB.put((Integer)number,name);
    }

    @Override
    public Integer getNumberByName(String name) {
        if (setOfMyPB.containsValue(name)){
            Map.Entry a = setOfMyPB.entrySet().stream()
                    .filter(x->x.getValue().equals(name))
                    .findFirst()
                    .orElse(null);
            return (Integer) a.getKey();


        }
        else return null;

    }

    @Override
    public String getNameByNumber(int number) {
        if (setOfMyPB.containsKey(number)) {
            return setOfMyPB.get(number);
        } else return null;

    }

    @Override
    public void storeToFile(File phoneBookFile)  {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(phoneBookFile));
            for (Map.Entry entry : setOfMyPB.entrySet()) {

                out.write(entry.getKey() + "," + entry.getValue() + "\n");
            } out.close();
        } catch (IOException e) {
            System.out.println("This file is not for store");
            e.printStackTrace();
        }

    }

    @Override
    public void loadFromFile(File phoneBookFile) {
        setOfMyPB.clear();
        BufferedReader in = null;
        try {in = new BufferedReader(new FileReader(phoneBookFile));
            String line;
            String divider = ",";
            int i=1;

            String[] buff = new String[2];

            while ((line = in.readLine()) != null) {
                try {
                    buff = line.split(divider, 2);

                    this.addUser((int) Integer.parseInt(buff[0]), buff[1]);

                } catch (RuntimeException e) {
                    System.out.println("Not correct data in line number " + i);
                    e.printStackTrace();

                }
                i++;
            }

            in.close();

        } catch (IOException e) {
            System.out.println("File for load not found");
            e.printStackTrace();
        }


    }
}
