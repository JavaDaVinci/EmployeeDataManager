import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter file name (example.txt): ");
        String file = scanner.nextLine();

        System.out.println("Enter the number of people you want to add: ");
        Integer numberOfPeople = scanner.nextInt();




        try {
            FileWriter writer = new FileWriter(file);
            for(int i = 0; i < numberOfPeople; i++) {
                Data data = new Data();
                data.setDays();
                data.setSchedule();
                writer.write(data.toString());
                writer.write("\n");
            }
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
