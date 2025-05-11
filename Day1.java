class Day1
{
  public static int findSecondLargest(int[] arr)
   {
    // int[] arr ={10,35,34,12,20}; 

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i]> first){
        second = first;
        first = arr[i];
      }
      else if(arr[i] < first && arr[i] > second){
        second =  arr[i];
      }

    }
    return (second == Integer.MIN_VALUE) ? -1 : second;
   

   }
   public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(findSecondLargest(arr)); // Output: 34
    }

}
