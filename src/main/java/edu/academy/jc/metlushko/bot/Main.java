package edu.academy.jc.metlushko.bot;


import java.io.File;

public class Main {
    public static void main(String[] args) {

        NeededFile neededFile=new NeededFile("c:/Debug/protokol/");
        File file=neededFile.getNeededFile();

        ListMessage listMessage=new ListMessage();
        listMessage.loadFromFileInList(file);

        CheckChangesInFile changesInFile=new CheckChangesInFile(file,listMessage);
        Thread thread=new Thread(changesInFile);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
