import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataTransfer {
    public static void main(String arg[]) {
        File inf = new File("in.dat");
        File outf = new File("out.dat");
        FileReader ins = null;
        FileWriter outs = null;
        try {
            ins = new FileReader(inf);
            outs = new FileWriter(outf);
            int ch;
            while ((ch = ins.read()) != -1) {
                outs.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                ins.close();
                outs.close();
            } catch (IOException e) {}
        }
    }
}
