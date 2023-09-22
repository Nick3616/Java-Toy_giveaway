import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class PrizeFile {
    private static final String FILE_NAME = "prizes.txt";

    PrizeFile() {
    }

    public static void writeToFile(String prize) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("prizes.txt", true));

            try {
                writer.write(prize);
                writer.newLine();
            } catch (Throwable var5) {
                try {
                    writer.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            writer.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }
}