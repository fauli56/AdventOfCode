package day03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        parseChar('p');

        FileReader fr = new FileReader("src/day03/input.txt");
        BufferedReader br = new BufferedReader(fr);

        int prioSum = 0;
        char[] firstGroupMember = new char[0];
        char[] secondGroupMember = new char[0];
        char[] thirdGroupMember = new char[0];
        int counter = 0;

        while(true){
            String line = br.readLine();
            counter++;
            if (line == null){
                break;
            }
            //PART 1
            /*int lineMid = line.length()/2;
            String lineFront = line.substring(0, lineMid);
            String lineBack = line.substring(lineMid);
            char[] lineFrontArray = lineFront.toCharArray();
            char[] lineBackArray = lineBack.toCharArray();
            char doubling = ' ';
            for(int i=0; i<lineFrontArray.length; i++){
                for (int j=0; j<lineBackArray.length; j++){
                    if(lineFrontArray[i]==lineBackArray[j]){
                        doubling = lineFrontArray[i];
                    }
                }
            }
            prioSum += parseChar(doubling); */
            //PART 2

            char doubling = ' ';

            if(counter%3 == 1){
                firstGroupMember = line.toCharArray();
            } else if (counter%3 == 2) {
                secondGroupMember = line.toCharArray();
            } else if (counter%3 == 0) {
                thirdGroupMember = line.toCharArray();

                for (char firstBag: firstGroupMember) {
                    for (char secondBag: secondGroupMember){
                        for (char thirdBag: thirdGroupMember) {
                            if(firstBag == secondBag && firstBag == thirdBag){
                                doubling = firstBag;

                            }
                        }
                    }
                }
            }
            if(counter%3 == 0)prioSum += parseChar(doubling);

        }

        System.out.println(prioSum);

    }

    public static int parseChar(char input) {
        int toReturn = input;

        if(Character.isUpperCase(input)){
            return toReturn - 38;
        }
        return toReturn - 96;

    }

}
