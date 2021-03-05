package assignment_6;

public class ThirtySix {



    public static void main(String[] args) {


        int [] arr = new int [] {1, 3, 30, 4, 10, 3, 7, 7, 0,0,4};

        System.out.println("Duplicate elements in given array: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }


    }
}
