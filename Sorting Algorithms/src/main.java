import java.io.IOException;
import java.util.ArrayList;
import Tools.Tokenizer;

/**
 *
 * @author Fernando García
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        System.out.println("Sorting Algorithms \n");
        // Token init
        Tokenizer token = new Tokenizer();
        ArrayList<Double> numbers = token.TokenNumbers(token.getFile());
        System.out.println(numbers.size());

        // Algorithms
        
        // Datasets
        
    }
    
}
