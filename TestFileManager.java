import manager.FileManager;
import plugins.compression.CompressionPlugin;
import plugins.encryption.EncryptionPlugin;

public class TestFileManager {
    public static void main(String[] args) {
        FileManager m = new FileManager();
        CompressionPlugin obj1 = new CompressionPlugin();
        m.add(obj1);
        obj1.performOperation("Java_Addition.java");
        EncryptionPlugin obj2 = new EncryptionPlugin();
        m.add(obj2);
        obj2.performOperation("Java_Multiplication.java");
        m.add(obj2);
    }
}
