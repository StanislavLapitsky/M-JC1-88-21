package edu.academy.jc.gapaniuk.hw10i11;

import java.io.*;
import java.util.Map;

public class PhoneBookImpl extends PhoneBook {


    @Override
    public void addUser(int number, String name) {
        this.put(number, name);
    }

    @Override
    public Integer getNumberByName(String name) {
        for (Entry entry : this.entrySet()) {

            if (name.equals(entry.getValue())) {
                return (Integer) entry.getKey();
            }
        }

        return null;
    }

    @Override
    public String getNameByNumber(int number) {
        if (this.containsKey(number)) {
            return this.get(number);
        } else return null;

    }

    @Override
    public void storeToFile(File phoneBookFile) throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter(phoneBookFile));
        for (Entry entry : this.entrySet()) {

            out.write(entry.getKey()+","+entry.getValue()+"\n");
        }
        out.close();

    }

    @Override
    public void loadFromFile(File phoneBookFile)  {
        this.clear();
        try (BufferedReader in = new BufferedReader(new FileReader(phoneBookFile))) {
            String line;
            String divider=",";
            String [] buff = new String[2];
            while ((line = in.readLine()) != null) {
                buff = line.split(divider, 2);

                this.addUser((int) Integer.parseInt(buff[0]), buff[1]);
            }
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
                    }







    }
}
