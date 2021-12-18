
import Algorithms.QuickSort;
import Tools.FileManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Fernando García
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        System.out.println("\tSorting Algorithms");
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();
        
        // File Manager
        FileManager manager = new FileManager();
        File file = manager.getFile();
        numbers = manager.getLinesContent(file, numbers);
        System.out.println(numbers);
        
        // Sorting
        QuickSort quick = new QuickSort();
        sorted = quick.HalfPivot(numbers, 0, numbers.size() - 1);
        
        // Printing results
        System.out.println(sorted);
    }
}
