package day6;

public class MethodDemo2 {

    public static String greet(){
        String gr= "Hello, Good morning";
        return gr;
    }

    public static int findMax(int a, int b){
        int max=0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        return max;
    }

    public static void main(String[] args) {
        String g = greet();
        System.out.println(g);

        int a= findMax(5,4);
        System.out.println("Max number is:" +a);
    }
}
