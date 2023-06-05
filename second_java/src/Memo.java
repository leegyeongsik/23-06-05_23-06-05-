import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Memo {

    ArrayList<String> set_memo_arr(String num){

        Scanner input = new Scanner(System.in);
        ArrayList<String> temp_arr = new ArrayList<>();
        temp_arr.add(num);

        System.out.println("작성자 이름 :");
        String input_name = input.nextLine();
        temp_arr.add(input_name);

        System.out.println("게시글 :");
        String input_contents = input.nextLine();
        temp_arr.add(input_contents);

        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        String format_Now = now.format(formatter);
        temp_arr.add(format_Now);

        System.out.println("비밀번호 :");
        String input_password = input.nextLine();
        temp_arr.add(input_password);

        return temp_arr;


    }

}
