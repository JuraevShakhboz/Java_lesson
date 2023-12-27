package Uchinchi_Oy.dars_42;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("files/text.txt");
        File outputFile = new File("files/output.txt");

        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            List<String> employeesToSave = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("[,;]");

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String email = parts[2];
                double salary = Double.parseDouble(parts[3]);

                if (salary > 300.0 && email.endsWith("@gmail.com")) {
                    employeesToSave.add(line);
                }
            }

            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String employee : employeesToSave) {
                bufferedWriter.write(employee);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Foydalanuvchilar ro'yxati saqlandi output.txt fayliga.");
        } catch (IOException e) {
            System.out.println("Fayl o'qish/yoziishda xatolik yuz berdi: " + e.getMessage());
        }
    }
}
