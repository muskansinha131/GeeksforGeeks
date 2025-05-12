public class Day2{
 public static void main(String[] args) {
    int arr[] = { 1,2,0,4,3,0,5,0};

    for(int i = 0 ; i < arr.length; i++){
       if(i == 7)
       {
           break;
       }
      if(arr[i] == 0)
      {
        int temp = arr[i+1];
        arr[i+1] = arr[i];
        arr[i] = temp;
      }

  
    }

    for(int i = 0 ; i < arr.length ; i++){
      System.out.print(arr[i] + " ");
    }
  }
}