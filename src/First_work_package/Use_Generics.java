package First_work_package;
import java.util.ArrayList;

public class Use_Generics {
    public static void main(String[] args) {
        // 리스트선언 시 제네릭을 사용
        // 문자열만 들어가게하여 이후 생길 수 있는 문제를 이과정에서 제거
        ArrayList<String> list = new ArrayList<String>();
        // 추가
        list.add("Hello" );
        list.add("Hello" );
        // 만약 list.add(123);인 인트 형으로 추가한다면 Error가 날 것이다.
    }
}
