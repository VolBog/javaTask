package Task1;

import java.io.*;
import java.util.Objects;

public class FileService {
    public static void folderCopy(File folderIn, File folderOut, String extention) throws IOException {
        if(!folderIn.isDirectory() && !folderOut.isDirectory()){
            throw new IOException();
        }
        for (File f :
                Objects.requireNonNull(folderIn.listFiles())) {
            if(f.isFile() && f.getName().endsWith(extention)){
                File fileOut = new File(folderOut, f.getName());
                fileCopy(f, fileOut);
            }
        }
    }

    public static void fileCopy(File in, File out) throws IOException {
        try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
            is.transferTo(os);
        } catch (IOException e) {
            throw e;
        }
    }
}
