package Tools;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Tokenizer {
    private File file;
    private Path path;

    public Tokenizer(){
        path = FileSystems.getDefault().getPath("").toAbsolutePath();
        file = new File(path + "\\Datasets\\numbers.txt");
    }

    public ArrayList<Double> TokenNumbers(File file) throws IOException{
        ArrayList<Double> numbers = new ArrayList<>();
        if(file.exists()){
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
                String line = reader.readLine();
                while (line != null) {
                    line = reader.readLine();
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("No such file in the directory: " + "\n" +file.getAbsolutePath());
        }
        return numbers;
    }

    public File getFile(){
        return this.file;
    }
}
