public class Merge{
  public static int[] temp1;
  public static int[] temp2;
  public static void mergeSort(int[] data){
    return mergeSort(data, 1, data.length);
  }
  public static void mergeSort(int[] data, int lo, int hi){
    if (lo >= hi){
      return;
    }

    mergeSort()
  }
  public static void split(int[] data){
    int length = 0;
    int count = 0;
    length = data.length / 2;
    temp1 = new int[length];
    for (int i = 0; i < length; i++){
      temp1[i] = data[i];
    }
    for (int a = length; a < data.length; a++){
      temp2[count] = data[a];
      count++;
    }
  }
}
