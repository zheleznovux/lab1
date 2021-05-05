package regEx;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeLogger implements Runnable {
    private File file;
    private int runEvery;
    private long lastPosition = 0;
    private boolean run = true;
    Pattern pattern = Pattern.compile("\\[\\d{4}.\\d{2}.21\\s(.+)].(.+(ERROR|error|err).+)");


    public DeLogger(File inputFile, int interval) {
        this.file = inputFile;
        this.runEvery = interval;
    }

    public void stop() {
        this.run = false;
    }

    public void run() {
        int c;
        String str = null;
        try
        {
            while (run) {
                Thread.sleep(runEvery);
                long fileLength = file.length();

                if (fileLength > lastPosition) {
                    RandomAccessFile fh = new RandomAccessFile(file, "r");
                    fh.seek(lastPosition);


                    while ((c = fh.read()) != -1) {
                        str += (char)c;
                        if((char)c == '\n'){
                            Matcher matcher = this.pattern.matcher(str);
                            while (matcher.find()){
                                System.out.print("At " + matcher.group(1) + " log: " + matcher.group(2) + '\n');
                            }
                            str = " ";
                        }
                    }

                    lastPosition = fh.getFilePointer();
                    fh.close();
                }
            }
        }
        catch (Exception e)
        {
            stop();
        }
    }
}
