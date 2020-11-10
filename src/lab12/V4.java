package lab12;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class V4 {

    public static void main(String[] args) {
            String input;
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            String regex=("((\\w+)@(\\w+\\.)(com|ru))|(\\w+)@localhost");
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(input);
            String str = "";
            int i = 0;
            while(m.find(i))
            {
                str += m.group() + " ";
                i = m.end();
            }
            System.out.println(str);
        }

}
