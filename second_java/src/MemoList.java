import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.util.List;


public class MemoList {
    ArrayList<ArrayList<String>> memo_arr = new ArrayList<>();
    String num ="0";
    void set_append_memo_arr(Memo i){
        Integer temp_num =Integer.valueOf(num);
        temp_num+=1;
        num = String.valueOf(temp_num);
        memo_arr.add(i.set_memo_arr(num));

    }
    void set_correction(Integer i ,String fix_contents){
        memo_arr.get(i).set(2,fix_contents);

        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        String format_Now = now.format(formatter);
        memo_arr.get(i).set(3,format_Now);
    }

    ArrayList<String> get_id_pwd(String n , String pwd) {
        ArrayList<String> temp_arr = new ArrayList<>();
        for (int i = 0; i < memo_arr.size(); i++) {
            for (int j = 0; j < 1; j++) {
                if (memo_arr.get(i).get(j).equals(n)) {
                    if (memo_arr.get(i).get(4).equals(pwd)) {
                        temp_arr.add(String.valueOf(i));
                        return temp_arr;
                    } else if (!memo_arr.get(i).get(j).equals(pwd)) {
                        System.out.println("비밀번호틀림");
                        return temp_arr;
                    }
                }
            }
        }
        System.out.println("찾는게없음");
        return temp_arr;
    }

    void set_delete(int i){
        memo_arr.remove(i);
    }
    void get_arr(){
//        for (int i = 0; i < memo_arr.size(); i++) {
//            List<String> head = memo_arr.get(i).subList(0, 4);
//            System.out.println(head);
        for (int i = 0; i < memo_arr.size(); i++) {
            System.out.println(memo_arr.get(i));
        }
    }

}
