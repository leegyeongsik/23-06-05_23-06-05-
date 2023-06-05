import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MemoList memoList = new MemoList();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("typing ( 입력 | 수정 | 삭제 | 목록 | 종료 | ) ");
            String inputs = input.nextLine();

            if (inputs.equals("입력")){
                memoList.set_append_memo_arr(new Memo());

            } else if (inputs.equals("삭제")) {
                ArrayList<String> id_pwd =memoList.get_id_pwd(input.nextLine() , input.nextLine());
                if (id_pwd.size() == 0){
                } else  {
                    int temp_num=Integer.parseInt(id_pwd.get(0));
                    memoList.set_delete(temp_num);
                }

            } else if (inputs.equals("수정")) {
                ArrayList<String> id_pwd =memoList.get_id_pwd(input.nextLine() , input.nextLine());
                if (id_pwd.size() == 0){
                } else  {
                    Integer temp_num=Integer.valueOf(id_pwd.get(0));
                    memoList.set_correction(temp_num , input.nextLine());
                }

            } else if (inputs.equals("목록")) {
                memoList.get_arr();
            } else if (inputs.equals("종료")) {
                break;
            }
        }
    }
}