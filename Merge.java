public class Merge{
  public static int[] temp1;
  public static int[] temp2;
  public static int[] merge;
  public static void mergeSort(int[] data){
    mergeSort(data, 1, data.length);
    return;
  }
  public static void mergeSort(int[] data, int lo, int hi){
    if (lo >= hi){
      merge(temp1, temp2);
    }
    if (data.length == 1){
      return;
    }
    if (data.length > 1){
      split(data);
      mergeSort(data, lo + 1, data.length);
    }
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
  public static void merge(int[] data, int[] data1){
    merge = new int[data.length + data1.length];
    if (data.length == 1 && data1.length == 1){
      if (data[0] >= data1[0]){
        merge[0] = data1[0];
        merge[1] = data[0];
      }
      else{
        merge[0] = data[0];
        merge[1] = data1[0];
      }
    }
    return;
    if (data.length > 1 && data1.length > 1){
      return;
    }
  }
}
