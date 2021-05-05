package regEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static sun.nio.ch.IOStatus.EOF;

public class Finder {

    String str;
    Pattern pattern = Pattern.compile("([-+]?[0-9]+[.]?[0-9]+)[ ]?([-+*\\/])[ ]?([-+]?[0-9]+[.]?[0-9]+)");
    Matcher matcher;
    FileReader file;

    ArrayList<String> results = new ArrayList<String>();

    public Finder(String str) throws IOException {
        this.file = new FileReader(str);

        _init();
    }

    public  Finder(File file) throws IOException {
        this.file = new FileReader(file);

        _init();
    }

    protected void _init() throws IOException
    {
        int value;
        String str = "";
        String result = "";

        while ((value = this.file.read()) != -1)
        {
            str += (char)value;
            if ( (char)value == '\n')
            {
                str = str.trim();
                matcher = pattern.matcher(str);

                while (matcher.find()) {
                    result = calc(matcher.group(2), matcher.group(1), matcher.group(3));
                }
                if(result.length() < 1) {
                    result = "No matches in this line";
                }

                results.add(result);
                System.out.println(str + " = " + result);
                result = "";
                str = "";
            }
        }

    }

    protected String calc(String mathSymbol, String s1, String s2) {

        double symbol1 = Double.parseDouble(s1);
        double symbol2 = Double.parseDouble(s2);
        double result = 0;

        switch (mathSymbol) {
            case "+":
                result = symbol1 + symbol2 ;
                break;
            case "-":
                result = symbol1 - symbol2 ;
                break;
            case "/":
                if((symbol1 < 0.0000000001)||(symbol2 < 0.0000000001)){
                    return "No result";
                } else {
                    result = symbol1 / symbol2 ;
                }
                break;
            case "*":
                result = symbol1 * symbol2 ;
                break;
        }
        return String.format ("%.2f", result);
    }

    public ArrayList<String> getResults() {
        return results;
    }
}
