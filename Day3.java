public class Day3{
  public static void main(String[] args){
    int arr[]={1,2,3,4,6,5};
    int first = 0 , last = arr.length-1;
    while(first < last){
      int temp = arr[ first ];
      arr[first] = arr[last];
      arr[last] = temp;
      first++;
      last--;
    }

    for(int i = 0 ; i < arr.length ; i++)
    {
      System.out.print(arr[i] +" ");
    }
  }
}