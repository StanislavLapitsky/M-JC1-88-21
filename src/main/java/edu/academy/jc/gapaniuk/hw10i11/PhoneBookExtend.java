package edu.academy.jc.gapaniuk.hw10i11;

import java.io.*;

public class PhoneBookExtend extends PhoneBookAC {




    @Override
    public Integer getNumberByName(String name) {
        for (Entry entry : this.entrySet()) {

            if (name.equals(entry.getValue())) {
                return (Integer) entry.getKey();
            }
        }
        System.out.println("Number not found");
        return null;
    }

    @Override
    public String getNameByNumber(int number) {
        if (this.containsKey(number)) {
            return this.get(number);
        } else {
            System.out.println("Name not found");
            return null;
        }
    }

    @Override
    public void storeToFile(File phoneBookFile)  {

        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(phoneBookFile));
            for (Entry entry : this.entrySet()) {
                out.write(entry.getKey() + "," + entry.getValue() + "\n");
            }

        } catch (IOException e) {
            System.out.println("This file is not for store");
            e.printStackTrace();
        }finally {
            try {
                if (out!=null){
                out.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public void loadFromFile(File phoneBookFile) {
        this.clear();
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



        } catch (IOException e) {
            System.out.println("File for load not found");
            e.printStackTrace();
        }
        finally {
            try {
                if (in!=null){
                in.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
