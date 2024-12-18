package plugins.encryption;

import plugins.*;

public class EncryptionPlugin implements FileOperation {
    public void performOperation(String fileName) {
        System.out.println("Encrypting file: " + fileName);
    }
}