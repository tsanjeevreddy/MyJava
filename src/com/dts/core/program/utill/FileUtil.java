package com.dts.core.program.utill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
    public static void readFileByFileName(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException ioE) {
            System.err.println("Error at reading file" + ioE.getMessage());
        } catch (Exception ex) {
            System.err.println("Error at reading file" + ex.getMessage());
        }
        System.out.println("Finished reading file: " + fileName);
    }

    public static void readFilesByFileNames(String[] fileNames) {
        for (String fileName : fileNames) {
            readFileByFileName(fileName);
        }
    }
}
