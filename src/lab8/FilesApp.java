package lab8;
import java.io.*;
//2. Реализовать вывод информации из файла на экран

public class FilesApp {
    public static void main(String[] args) throws IOException {
               FileReader reader = new FileReader("src/lab8/hey.txt");
                    int c;
                    while ((c = reader.read()) != -1) {
                        System.out.print((char) c);
                    }

            }
        }