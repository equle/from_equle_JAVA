package First_work_package;

public class Use_switch_case {
    public static void main(String[] args) {
        int i = 3;

        switch(i){
            case 1: // i == 1
                System. out.println("변수 i는 1 입니다.");
                break;
            case 2: // i == 2
                System. out.println("변수 i는 2입니다.");
                break;
            case 3: // i == 3
                System. out.println("변수 i는 3입니다.");
                break;
            default: // 그외 다른 숫자들
                System. out.println("변수 1,2,3이 아닌 값입니다.");
                break;
        }
    }
}
