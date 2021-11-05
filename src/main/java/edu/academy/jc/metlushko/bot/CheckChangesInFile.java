package edu.academy.jc.metlushko.bot;

import java.io.File;
import java.util.Arrays;

public class CheckChangesInFile implements Runnable {
    private File file = null;
    private ListMessage listMessage = null;



    public CheckChangesInFile(File file, ListMessage listMessage) {
        this.file = file;
        this.listMessage = listMessage;
    }

    @Override
    public void run() {
        long date = file.lastModified();
        while (true) {
            if (file.lastModified() != date) {
                listMessage.loadFromFileInList(file);
                System.out.println(Arrays.toString(listMessage.getListMessage().stream()
                        .skip(listMessage.getListMessage().size() - 8)
                        .skip( - 8)
                        .limit(7)
                        .toArray(String[]::new)));
                date = file.lastModified();
            }
            try {
                Thread.sleep(2L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

