/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author Fernando García
 */
public class FileManager {

    Path projectPath;

    public FileManager() {
        this.projectPath = FileSystems.getDefault().getPath("").toAbsolutePath();
    }

    public void number100File() throws FileNotFoundException, IOException {
        File file = new File(this.projectPath.toString() + "\\Datasets\\100numbers.txt");
        try ( BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (String line; (line = br.readLine()) != null;) {
                // process the line.
                System.out.println(line);
            }
            // line is not visible here.
        }
    }

}
