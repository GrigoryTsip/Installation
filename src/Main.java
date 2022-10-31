import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

       if (createDir("C://Games", "null")) {
            if (createDir("C://Games/src", "null")) {
                if (createDir("C://Games/src/main", "null")) {
                    createDir("C://Games/src/main", "Main.java");
                    createDir("C://Games/src/main", "Utils.java");
                }
                createDir("C://Games/src/test", "null");
            }
            ;
            if (createDir("C://Games/res", "null")) {
                createDir("C://Games/res/drawables", "null");
                createDir("C://Games/res/vectors", "null");
                createDir("C://Games/res/icons", "null");
            }
            createDir("C://Games/savegames", "null");
            if (createDir("C://Games/temp", "null"))
                createDir("C://Games/temp", "temp.txt");
        }
    }

    public static boolean createDir(String path, String file) {

        if (file.equals("null")) {

            File objName = new File(path);

            if (objName.mkdir()) {
                System.out.println("Директория " + path + " создана");
                return true;
            } else {
                System.out.println("Не удалось создать директорию " + path);
                return false;
            }
        } else {

            File objName = new File(path, file);

            try {
                if (objName.createNewFile())
                    System.out.println("Файл " + file + " создан");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            return true;
        }
    }
}
