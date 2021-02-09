import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileManagerImplTest {

    @Test
    public void read() throws Exception{
        FileManager fm = new FileManagerImpl("myFile");

        String msg = "Hello There";
        String msg2 = "How are you?";

        String expected = msg + System.lineSeparator() + msg2 + System.lineSeparator();

        fm.write(msg);
        fm.write(msg2);

        String actual = fm.read();

        Assert.assertEquals(expected, actual);
    }
}