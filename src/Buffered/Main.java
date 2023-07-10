package Buffered;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter file to create : ");

        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine() + ".txt"));

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.println("Enter text to write into the file enter Q to stop: ");
        while (!(input = reader2.readLine()).equalsIgnoreCase("Q")) {
            writer.write(input);
            writer.newLine(); // Add a new line after each input
        }

        writer.close();


        /*File file = new File("output.word");
        System.out.println(file);
        file.delete();*/
    }
}
