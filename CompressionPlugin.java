package plugins.compression;

import plugins.FileOperation;

public class CompressionPlugin implements FileOperation {
    public void performOperation(String fileName) {
        System.out.println("Compressing file: " + fileName);
    }
}