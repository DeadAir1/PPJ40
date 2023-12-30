package PRIVATE.Notepad;

import java.io.File;
import java.io.IOException;

public class Note {
    private String name,path,creationDate;

    public Note(String name,String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
        this.path="src/PRIVATE/Notepad" + "/"+ this.name + ".txt";
        try{
            File file=new File(path);
            if(!file.exists()){
                if(file.createNewFile() ) System.out.println("File created");
                else System.out.println("File not created");
            }else System.out.println("File exists");
        }
        catch (IOException ex ){
            ex.printStackTrace();
        }

    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getName() {
        return name;
    }

     public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return
                "Name = " + name + '\n' +
                "Path = " + path + '\n' +
                "CreationDate = " + creationDate + '\n' ;

    }
}
