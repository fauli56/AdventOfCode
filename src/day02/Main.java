package day02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/day02/input.txt");
        BufferedReader br = new BufferedReader(fr);

        String line="";
        ArrayList<String[]> strategy = new ArrayList<>();

        while(true)
        {
            line = br.readLine();
            if(line == null){
                break;
            }
            strategy.add(line.split(" "));
        }

        br.close();

        int totalScore = 0;
        for(int i=0; i<strategy.size(); i++){
            String[] tupel = strategy.get(i);

            //PART 2
            switch (tupel[1]){
                case "X":
                    totalScore+=0;
                    switch (tupel[0]){
                        case "A":                           //Scissor(C) 3, Paper(B) 2, Rock(A) 1
                            totalScore+=3;
                            break;
                        case "B":
                            totalScore+=1;
                            break;
                        case "C":
                            totalScore+=2;
                            break;
                    }

                    break;
                case "Y":
                    totalScore+=3;
                    switch (tupel[0]){
                        case "A":                       //Scissor(C) 3, Paper(B) 2, Rock(A) 1
                            totalScore+=1;
                            break;
                        case "B":
                            totalScore+=2;
                            break;
                        case "C":
                            totalScore+=3;
                            break;
                    }
                    break;
                case "Z":
                    totalScore+=6;
                    switch (tupel[0]){
                        case "A":                       //Scissor(C) 3, Paper(B) 2, Rock(A) 1
                            totalScore+=2;
                            break;
                        case "B":
                            totalScore+=3;
                            break;
                        case "C":
                            totalScore+=1;
                            break;
                    }
                    break;
            }
        }



            //PART 1
            /*switch (tupel[1]){
                case "X":
                    totalScore+=1;
                    switch (tupel[0]){
                        case "A":
                            totalScore+=3;
                            break;
                        case "B":
                            totalScore+=0;
                            break;
                        case "C":
                            totalScore+=6;
                            break;
                    }

                    break;
                case "Y":
                    totalScore+=2;
                    switch (tupel[0]){
                        case "A":
                            totalScore+=6;
                            break;
                        case "B":
                            totalScore+=3;
                            break;
                        case "C":
                            totalScore+=0;
                            break;
                    }
                    break;
                case "Z":
                    totalScore+=3;
                    switch (tupel[0]){
                        case "A":
                            totalScore+=0;
                            break;
                        case "B":
                            totalScore+=6;
                            break;
                        case "C":
                            totalScore+=3;
                            break;
                    }
                    break;
            }
        }*/
        System.out.println(totalScore);

    }
}
