package helpers;

import java.io.FileWriter;
import java.io.IOException;

public class BoTestIO {
    public static void writeToFile(String pathname, String content) {
        // createFile(pathname);

        try {
            FileWriter myWriter = new FileWriter(pathname);
            myWriter.write(content);
            myWriter.close();
            System.out.println("##########");
            System.out.println("Successfully wrote to the file " + pathname + "...");
            System.out.println("##########");
        } catch (IOException e) {
            System.out.println("##########");
            System.out.println("An error occurred while writing to the file " + pathname + "...");
            System.out.println("##########");
            e.printStackTrace();
        }
    }

//    private static void createFile(String pathname) {
//        try {
//            File myObj = new File(pathname);
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
}
