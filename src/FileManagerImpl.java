import java.io.*;

public class FileManagerImpl implements FileManager {
    private File file;
    private OutputStream os;
    private InputStream is;

    /**
     * Create new fileManager. Manages the file, with nome fileName
     * @param fileName File is stored under this name, has to be unique
     *                 IF Filemanager with this name already exists then previous File gets overwritten
     * @throws IOException if file can't be created or accessed
     */
    public FileManagerImpl(String fileName) throws IOException{
        file = new File(fileName + ".txt");
        os = new FileOutputStream(file.getPath());
        is = new FileInputStream(file.getPath());

    }

    @Override
    public void write(String txt) throws IOException {
        if (file == null)
            throw new IOException("File not set!");

        PrintStream ps = new PrintStream(os);
        ps.println(txt);
    }

    @Override
    public String read() throws IOException {
        //BufferedReader br = new BufferedReader(new FileReader(file));

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while(line != null){
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }

        return sb.toString();
    }
}
