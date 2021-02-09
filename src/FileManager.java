import java.io.IOException;

public interface FileManager {
    /**
     * writes txt to file
     * @param txt to be written to file, appends previous txt written to this file's end
     * @throws IOException Pile has to be set for this PileManager
     */
    void write(String txt) throws IOException;

    /**
     * reads from file
     * @return file content
     * @throws IOException
     */
    String read() throws IOException;
}
