package Task1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("AAAA");
        file.mkdirs();

        File fileOut = new File("read");
        fileOut.mkdirs();

        try {
            FileService.folderCopy(file, fileOut, "pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
