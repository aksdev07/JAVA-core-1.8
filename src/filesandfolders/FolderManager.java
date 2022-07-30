package filesandfolders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FolderManager {
    /**
     * user.home, user.os, user.dir
     */
    private String targetPath = System.getProperty("user.home") + "\\Desktop\\Test\\";
    private String currentPath = System.getProperty("user.dir") + "\\src\\filesandfolders\\Test\\";
    private Scanner sc = new Scanner(System.in);
    private String folderName;
    private String subFolder;
    private String currentDateFolder;
    FolderManager(){
        System.out.println("Enter the name of the desired a directory: ");
        currentDateFolder = sc.next();
    }

    public void createFolder(String fName) {
        System.out.println(targetPath);
//        System.out.println("Enter the name of the desired a directory: ");
//        folderName = targetPath + sc.next();
        folderName = targetPath + fName;
        File file = new File(folderName);
        boolean bool = file.mkdir();
        if (bool) {
            System.out.println("Folder is created successfully");
        } else {
            System.out.println("Error Found!");
        }
        createSubFolder(fName);
    }

    public void inputFolderName() throws IOException {
        //File file = new File(currentPath + "foldernames.txt");
        BufferedReader br = new BufferedReader(new FileReader(currentPath + "foldernames"));
        String st;
        while ((st = br.readLine()) != null)
            createFolder(st);
        System.out.println(st);

    }

    private void createSubFolder(String fName) {

        folderName = targetPath + fName+"\\"+currentDateFolder;
        //subFolder = folderName;
        File file = new File(folderName);
        boolean bool = file.mkdir();
        if (bool) {
            System.out.println("Folder is created successfully");
        } else {
            System.out.println("Error Found!");
        }
    }
}
