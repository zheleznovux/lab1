package regEx;
import java.io.IOException;
import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PathParser {

    File currentDir;
    ArrayList<File> files;
    ArrayList<File> directories;

    public PathParser(String path) {
        this.currentDir = new File(path);
        initFiles();
    }

    protected void initFiles(){
        File[] allFiles  = this.currentDir.listFiles();
        this.files = new ArrayList<File>();
        this.directories = new ArrayList<File>();

        for (File file : allFiles) {
            if (file.isDirectory()) {
                this.directories.add(file);
            } else if(file.isFile()) {
                this.files.add(file);
            }
        }

        Collections.sort(this.files, (Comparator<File>) (f1, f2) -> Long.compare(f2.lastModified(), f1.lastModified()));
        Collections.sort(this.directories, (Comparator<File>) (f1, f2) -> Long.compare(f2.lastModified(), f1.lastModified()));
    }
    
    public ArrayList<String> getFileList() {
        ArrayList<String> fileList = new ArrayList<String>();

        for (File file : this.files) {
            if(file.isFile()){
                fileList.add(file.getName());
            }
        }

        return fileList;
    }

    public ArrayList<String> getDirList() {
        ArrayList<String> dirList = new ArrayList<String>();

        for (File file : this.directories) {
            if(file.isFile()){
                dirList.add(file.getName());
            }
        }

        return dirList;
    }
    
    public void displayContent() {
        try
        {
            for (File file : this.files) {
                    System.out.println("file:\t" + file.getCanonicalPath());
            }
            for (File file : this.directories) {
                System.out.println("dir:\t" + file.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public File getFirstFileByName(String name){

        for (File file : this.files) {
            if(file.getName().contains(name)){
                return file;
            }
        }
        return null;
    }

    public ArrayList<File> getFilesByName(String name){
        ArrayList<File> result = new ArrayList<File>();
        Pattern pattern = Pattern.compile(name, Pattern.CASE_INSENSITIVE);

        for (File file : this.files) {
            Matcher matcher = pattern.matcher(file.getName());
            if(matcher.find()) {
                result.add(file);
            }
        }
        return result;
    }
}
