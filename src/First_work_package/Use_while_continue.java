package First_work_package;

public class Use_while_continue {
    public static void main(String[] args) {
        int i=0;
        while (i < 5){
            if(i ==3){
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
