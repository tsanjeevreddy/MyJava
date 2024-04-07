package com.dts.core.program.file;

import com.dts.core.program.utill.FileUtil;

public class ReadFromFile {
    public static void main(String[] as) {
        String fileName = "/Users/{userName}/Desktop/test.txt";
        FileUtil.readFileByFileName(fileName);
    }
}
