package filesandfolders;

import java.io.IOException;

public class FolderDriver extends FolderManager{
    public static void main(String[] args) throws IOException {
        FolderManager obj = new FolderManager();
        obj.inputFolderName();
    }
}
