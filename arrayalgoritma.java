import java.util.Arrays;

public class arrayalgoritma {
    public static void main(String[] args) {
        int[] arr = {12, 9, 13, 6, 10, 4, 7, 2};
        
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %3 !=0){
                count++;

            }
            
        }
        int[] result = new int[count];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] %3 !=0){
                result[index++]=arr[j];
            
        }
        
    }
    Arrays.sort(result);
    System.out.println(Arrays.toString(result));
            
        }
    }
    

