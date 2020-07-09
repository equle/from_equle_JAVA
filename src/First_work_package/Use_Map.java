package First_work_package;
import java.util.HashMap;

public class Use_Map {
    public static void main(String[] args) {
        // Map
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // reference data type 이 아닌 data type일 경우 에러
        // HashMap<String, int> map = new HashMap<String, int >();

        map.put("one" , 1);
        map.put("two" , 2);
        System. out.println(map .get("one"));
        System. out.println(map .get("three")); // null("three"와 일치하는 데이터가 없어서 get할 데이터가 없음)
        System.out.println(map.containsKey("three")); // 해당 값이 있는제 boolean으로 출력
        System.out.println(map.remove("one"));// => delete
        System.out.println(map.get("two")); // => select
        System.out.println(map.size()); // => size
    }
}
