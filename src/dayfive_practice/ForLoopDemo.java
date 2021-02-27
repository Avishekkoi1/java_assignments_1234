package dayfive_practice;

public class ForLoopDemo {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for(int i=1; i<=n; i++){
            System.out.println(i);
            sum=sum+i;

        }
        System.out.println("=========");
        System.out.println("The running sum is:" +sum);
    }
}
