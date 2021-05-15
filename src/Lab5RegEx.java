import regEx.Finder;
import regEx.PathParser;
import java.io.*;
import java.util.ArrayList;

public class Lab5RegEx {
    public static void main(String args[]) throws IOException {
        PathParser parseDir = new PathParser("C:\\Users\\zhele\\Desktop");
        parseDir.displayContent();
        System.out.println("-------------------\n");

        ArrayList<File> files = parseDir.getFilesByName("math");

        Finder finder = new Finder(files.get(0));

//        ArrayList<String> results = new ArrayList<String>();
//        results = finder.getResults();
//        for (String result : results) {
//            System.out.println(result);
//        }
    }
}



