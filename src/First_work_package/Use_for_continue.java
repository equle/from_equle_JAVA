package First_work_package;

public class Use_for_continue {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++){
            // i가 3일경우 넘어감
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
