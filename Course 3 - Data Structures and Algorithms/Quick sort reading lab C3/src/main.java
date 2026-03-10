import java.util.Arrays;

public class main{
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "orange", "kiwi", "grape"};
        quickSort(words, 0, words.length - 1);

        System.out.print("Sorted words: ");
        for (String number : words) {
            System.out.print(Arrays.toString(words) + " ");
        }
    }
    public static void quickSort(String[] arr , int low , int high){
        if(low<high){
            int pi=partition(arr,low,high);
            //Recursively sort elements before and after partition
            //Left quick sort
            quickSort(arr,low,pi-1);
            //Right quick sort
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition (String[] arr , int low , int high){
        String pivot=arr[high];
        int i=low-1;
        for(int j = low ; j<high ; j++){
            if((arr[j].compareTo(pivot))<0 || (arr[j].compareTo(pivot))==0 ){
                i++;
                String temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high]= temp;
        return i+1;
    }
}
