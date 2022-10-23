import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<String> liste = new LinkedList<>();

        File file = new File("C://Users//casper//Desktop//data.txt");
        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);

        while ((line = bReader.readLine()) !=null){

            liste.addFront(line);
        }
        liste.display(); // Question1











    }
}