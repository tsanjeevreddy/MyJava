package com.dts.core.features.files;

import java.io.*;

public class FileStreamTest {
    public static void main(String[] as) {
        String path = "/Users/dtsreddy/Desktop/test";
        File file = new File(path+ "/testFile.txt");

        if(file.isFile() && file.length()>0){
            System.out.println("File exists");
            try {
                readFile(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("no let's create a tile");
            try {
                FileWriter writer = new FileWriter(file);
                writer.write("The first line");
                writer.write("The second line");
                writer.close();
                System.out.println(" File created Successfully");
                readFile(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        // Create directory now.
       // d.mkdirs();
    }

    private static void readFile(File file) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                String st;
                if ((st= br.readLine()) != null) {
                    System.out.println("Accessing File have date to read.......");
                    System.out.println(st);
                } else {
                    System.out.println("Accessing File was empty...");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(br);
        }
}
