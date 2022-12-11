package day01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static ArrayList<Integer> groupValues = new ArrayList<Integer>();


    public static void main(String[] args) throws IOException {
        importData(groupValues);
        Collections.sort(groupValues, Collections.reverseOrder());
        System.out.println(groupValues);

        int maxValue01 = groupValues.get(0);
        int maxValue02 = groupValues.get(1);
        int maxValue03 = groupValues.get(2);


        int maxValue = maxValue01+maxValue02+maxValue03;
        System.out.println(maxValue);



    }
    private static void importData(ArrayList groupValues) throws IOException {
        FileReader fr = new FileReader("src/day01/input.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        int lineValue=0;


        while (true) {
            line = br.readLine();
            if(line == null){
                break;
            }

            if (!line.equals("")) {
                lineValue += Integer.parseInt(line);
            }else{
                groupValues.add(lineValue);
                lineValue=0;
            }
        }
        br.close();


    }

}
