package dayfive_practice;

public class NestedLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++ ){
            for(int j=1; j<=3; j++){
                if(j==3){
                    break;
                }
                System.out.println(i+ " " +j+ " ");
            }
            System.out.println();
        }
        System.out.println("Out from the loop");
    }
}
