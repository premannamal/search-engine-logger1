import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SearchEngineLogger {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");
        BufferedWriter bufWriter;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("logs.txt", false);
        } catch (IOException e) {
            e.printStackTrace();
        }

        bufWriter  = new BufferedWriter(fileWriter);
        Scanner scanner = new Scanner(System.in);

            String initialTime = LocalDateTime.now().format(fmt1);
            System.out.println(initialTime);
            try {
                bufWriter.write(initialTime + "launch\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String response;
            do {
                System.out.println("Enter a search term (X or x to exit)");
                response = scanner.nextLine();

                if (!response.equalsIgnoreCase("X")) {
                    String logLine = LocalDateTime.now().format(fmt1) + " Search: " +response + "\n";
                    bufWriter.write(logLine);
                }
            } while (!response.equalsIgnoreCase("X"));

            bufWriter.write(LocalDateTime.now().format(fmt1) + "exit\n");


        bufWriter.close();
    }
}