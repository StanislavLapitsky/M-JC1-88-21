package edu.academy.jc.metlushko.bot;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMessage {
    private File file = null;
    private List<String> list = null;

    public List<String> getListMessage() {
        return list;
    }

    public ListMessage() {
        list = new ArrayList<>();
    }

    public void loadFromFileInList(File file) {
        try (FileReader fr = new FileReader(this.file = file);
             BufferedReader br = new BufferedReader(fr)) {
            if (file.exists()) {
                String line;
                while ((line = br.readLine()) != null) {
                    stringProcessing(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void stringProcessing(String line) {
        String[] arr = line.split("\t");
        if (!line.equals("")) {
            try {
                list.addAll(Arrays.asList(arr));
            } catch (NullPointerException e) {
                System.out.println("Data is incorrect  ");
            }
        }
    }

    public Integer numberOfProcessedObject() {
        return !list.isEmpty() ? list.size() : null;
    }

    public String[] getMessage() {
        return list.stream()
                .skip(list.size() - 8)
                .limit(7)
                .toArray(String[]::new);

    }


}
