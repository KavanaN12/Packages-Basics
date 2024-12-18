package manager;

import java.util.HashMap;
import java.util.Map;

import plugins.FileOperation;
import plugins.compression.CompressionPlugin;
import plugins.encryption.EncryptionPlugin;

public class FileManager {
    Map<Integer, FileOperation> p = new HashMap<>();
    static Integer k = 1, j;

    public void add(CompressionPlugin obj) {
        boolean key = false;
        for (int i = 0; i < k; i++) {
            if (obj == p.get(i)) {
                key = true;
            }
        }
        if (key == false) {
            System.out.println("Adding CompressionPlugin...");
            p.put(k, obj);
            k++;
        }
    }

    public void add(EncryptionPlugin obj) {
        boolean key = false;
        for (int i = 0; i < k; i++) {
            if (obj == p.get(i)) {
                key = true;
            }
        }
        if (key == false) {
            System.out.println("Adding EncryptionPlugin...");
            p.put(k, obj);
            k++;
        }
    }
}
