import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class File2Array {
    public static void main(String [] args) throws FileNotFoundException {
        String [] rows = new Scanner(new File("input.txt")).useDelimiter("\\Z").next().split("\n");

        for ( String s : rows )
            System.out.println(s);
    }


}