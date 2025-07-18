import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("kod.txt");
        if (!file.exists()){    //dosyanın oluşup oluşmadıgını kontrol eder
            file.createNewFile();
        }

        String val ="I love java!";
        FileWriter fWriter = new FileWriter(file,false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);   //işlem hızlandırmakm için
        bWriter.write(val);
        bWriter.write("\nBut didn't C");
        bWriter.close();

        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);

        while ( (line = bReader.readLine()) != null){
            System.out.println(line);
        }
        bReader.close();


    }
}