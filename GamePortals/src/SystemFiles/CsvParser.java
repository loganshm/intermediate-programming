package SystemFiles;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CsvParser {


        String fileName= "read_ex.csv";
        File file= new File(fileName);
        Scanner inputStream;
        List<List<String>> lines = new ArrayList<>();

        // this gives you a 2-dimensional array of strings
        
        public void csvRead(){
            try{
                inputStream = new Scanner(file);

                while(inputStream.hasNext()){
                    String line= inputStream.next();
                    String[] values = line.split(",");
                    // this adds the currently parsed line to the 2-dimensional string array
                    lines.add(Arrays.asList(values));
                }

                inputStream.close();
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            // the following code lets you iterate through the 2-dimensional array
            int lineNo = 1;
            for(List<String> line: lines) {
                int columnNo = 1;
                for (String value: line) {
                    System.out.println("Line " + lineNo + " Column " + columnNo + ": " + value);
                    columnNo++;
                }
                lineNo++;
            }
    }
}
