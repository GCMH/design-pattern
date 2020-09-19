package com.hcf.head.first.design.pattern.chapter03.ioextra;


import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertTrue;

public class LowerCaseInputStreamTest {

    @Test
    public void should_input_lower_case_when_read_file_content() throws IOException {
        String fileName = "temp.txt";
        String inputContent = "Hello World!";
        generateFile(fileName, inputContent);

        StringBuffer outputContent = readFileContent(fileName);

        assertTrue(outputContent.toString().equals("hello world!"));

        deleteFile(fileName);
    }

    private void deleteFile(String fileName) {
        File file = new File(fileName);
        assertTrue(file.delete());
    }

    private StringBuffer readFileContent(String fileName) throws IOException {
        InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(new File(fileName))));
        int c = -1;
        StringBuffer outputContent = new StringBuffer();
        while ((c = inputStream.read()) > 0) {
            outputContent.append((char) c);
        }
        inputStream.close();
        return outputContent;
    }

    private void generateFile(String fileName, String inputContent) throws IOException {
        OutputStream outputStream = new FileOutputStream(new File(fileName));
        outputStream.write(inputContent.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}