package pract12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class File {
    private String path;

    File(){}
    public void main() {
        Scanner scan = new Scanner(System.in);
        this.path = scan.nextLine();
    }

    StringBuilder getLine() throws IOException {
        String string = new String(Files.readAllBytes(Paths.get(path)));
        String[] words = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].charAt(words[i].length() - 1) == words[j].charAt(0)&&
                        !words[i].equals(" ") && !words[j].equals(" ")&&i!=j)
                {
                    stringBuilder.append(words[i]).append(" ").append(words[j]).append(" ");
                    words[i]=" ";
                    int k=-1;
                   while(k<words.length-1){
                       k++;
                       if (words[j].charAt(words[j].length() - 1) == words[k].charAt(0) &&
                               !words[k].equals(" ") && !words[j].equals(" ") && j != k)
                       {
                           stringBuilder.append(words[k]).append(" ");
                           words[j]=words[k];
                           words[k]=" ";
                           k=-1;
                       }
                   }
                   words[j]=" ";
                }
            }
        }
        for (String word : words) {
            if (!word.equals(" "))
                stringBuilder.append(word).append(" ");
        }
        return stringBuilder;
    }
}
//src/pract12/t.txt