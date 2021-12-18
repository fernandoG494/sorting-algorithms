/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author Fernando García
 */
public class FileManager {

    private final String path;
    private final JFileChooser selector;
    private final int res;
    private File archivo;

    public FileManager() {
        this.path = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        this.selector = new JFileChooser(path);
        this.selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        this.res = selector.showOpenDialog(null);
    }

    public File getFile() {
        if (res == 1) {
            return null;
        }
        return this.archivo = selector.getSelectedFile();
    }

    public ArrayList<Integer> getLinesContent(File file, ArrayList<Integer> numbers) throws IOException {
        try {
            BufferedReader b = new BufferedReader(new FileReader(file));
            String readLine = "";
            System.out.println("Reading file using Buffered Reader...");
            while ((readLine = b.readLine()) != null) {
                String[] filteredNumbers = readLine.split(",");
                for(int i = 0; i < filteredNumbers.length; i++){
                    numbers.add(Integer.parseInt(filteredNumbers[i]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
}
