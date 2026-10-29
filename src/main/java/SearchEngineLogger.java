import java.io.*;
import java.util.*;
public class SearchEngineLogger {
    public static void main(String[] args) {

        FileWriter fileWriter;
        Scanner scanner = new Scanner(System.in);
        try {
            fileWriter = new FileWriter("logs.txt");
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

        String text;
        text = "id|name|gross pay" + "\n";
        bufWriter.write(text);

        while (true) {




                // Display the employee using printf
                //System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n", emp.getemployeeId(), emp.getname(), emp.getGrossPay(hoursWorked, payRate));

                //Write to the file
                text = emp.getemployeeId() + "|" + emp.getname() + "|" + emp.getGrossPay(hoursWorked, payRate)+ "\n";
                bufWriter.write(text);
            }
// close the stream and release the resources
        }
        bufReader.close();
        bufWriter.close();

                ---
    }
}
