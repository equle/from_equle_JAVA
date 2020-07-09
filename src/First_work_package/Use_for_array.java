package First_work_package;

public class Use_for_array {
    public static void main(String[] args) {
        // for문을 사용한 배열 출력
        //선언
        String numbers[] = {"one", "two", "three"};
        //length 이용한 반복
        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
