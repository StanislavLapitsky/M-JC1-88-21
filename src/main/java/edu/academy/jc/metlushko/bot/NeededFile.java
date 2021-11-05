package edu.academy.jc.metlushko.bot;
/*
* Find one needed file in directory  with last Modified
*
* */

import java.io.File;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class NeededFile {
    private File dir = null;

    public NeededFile(String dirAddress) {
        dir = new File(dirAddress);
    }

    public File getNeededFile() {
        Optional<File> file = Stream.of(Objects.requireNonNull(dir.listFiles(File::isFile)))
                .max((o1, o2) -> Long.compare(o1.lastModified(), o2.lastModified()));
        return file.orElse(null);
    }

}
