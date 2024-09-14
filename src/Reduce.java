public class Reduce {
    public static void main(String[] args) {
        int count = 0;


        for(int i = 100; i > 0; i--){
            if (i % 2 == 0){
                i = i / 2;
                count++;
            }else{
                i = i - 1;
                count++;
            }
        }
        System.out.println(count);


    }
}
