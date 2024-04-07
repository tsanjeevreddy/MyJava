package com.dts.core.program.threads;

import com.dts.core.program.utill.FileUtil;

public class FileReaderTask implements Runnable {

    private final String[] fileNames;
    FileReaderTask(String[] fileNames) {
        this.fileNames = fileNames;
    }

    @Override
    public void run() {
        FileUtil.readFilesByFileNames(fileNames);
    }
    
}
