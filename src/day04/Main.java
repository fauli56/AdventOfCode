package day04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/day04/input.txt");
        BufferedReader br = new BufferedReader(fr);

        int overlaps = 0;
        while (true){
            String line = br.readLine();
            if (line==null)break;

            String[] pair = line.split(",");

            String[] pair1Values = pair[0].split("-");
            String[] pair2Values = pair[1].split("-");

            int pair1StartValue = Integer.parseInt(pair1Values[0]);
            int pair1EndValue = Integer.parseInt(pair1Values[1]);
            int pair2StartValue = Integer.parseInt(pair2Values[0]);
            int pair2EndValue = Integer.parseInt(pair2Values[1]);

            //PART 1
            /* if((pair1StartValue >= pair2StartValue && pair1EndValue <= pair2EndValue) ||
                    (pair2StartValue >= pair1StartValue && pair2EndValue <= pair1EndValue)){
                overlaps++;
            }*/

            if((pair1StartValue <= pair2StartValue && pair2StartValue<= pair1EndValue) || (pair2StartValue <= pair1StartValue && pair1StartValue<= pair2EndValue)){
                overlaps++;
            }

        }
        System.out.println(overlaps);
    }
}
