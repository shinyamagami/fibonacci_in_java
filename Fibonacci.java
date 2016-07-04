public class Fibonacci{
    public static void fibonacci(){
        int i = 1;
        int j = 1;

        for (int k = 1; k <= 6; k++){
	       System.out.print(i + " " + j + " ");
           i = i + j;
           j = i + j;
        }
    }
    public static void main(String[] args){
        fibonacci();
    }
}
