import java.util.*;
public class Merge{
  public static int[] temp1;
  public static int[] temp2;
  public static int[] merge;
  public static void mergesort(int[] data){
    mergesort(data, 0, data.length - 1);

  }
  public static void mergesort(int[] data, int lo, int hi){
    if (lo >= hi){
      return;
    }
    if (hi - lo < 50){
      insertionsort(data, lo, hi);
    }
    else{
      temp1 = new int[data.length / 2];
      temp2 = new int[data.length - data.length / 2];
      for (int i = 0; i < temp1.length; i++){
        temp1[i] = data[i];
      }
      for (int a = 0; a < temp2.length; a++){
        temp2[a] = data[a + data.length/2];
      }
      mergesort(temp1, 0, temp1.length - 1);
      mergesort(temp2, 0, temp2.length - 1);
      merge(data, temp1, temp2);
  //   if (data.length == 1){
  //     merge(temp1, temp2);
  //   }
  //   if (data.length > 1){
  //     split(data);
  //     mergeSort(temp1, lo + 1, temp1.length);
  //     mergeSort(temp2, lo + 1, temp2.length);
  //   }
  // }
}
}
  public static void merge(int[] data, int[] a, int[] b){
    int x, y;
    x = 0; y = 0;
    for (int i = 0; i < data.length; i++){
      if (x >= a.length){
        data[i] = b[y];
        y++;
      }
    else if (y >= b.length){
      data[i] = a[x];
      x++;
    }
    else if (a[x] <= b[y]){
      data[i] = a[x];
      x++;
    }
    else if (b[y] < a[x]){
      data[i] = b[y];
      y++;
    }
  }
}
public static void insertionsort(int[] ary, int start, int end){
  int length = end - start + 1;
  for (int i = 1; i < length; i++){
    int save = ary[start + i];
    int a;
    for(a = i; a > 0 && save < ary[start + a - 1]; a--){
      ary[start + a] = ary[start + a - 1];
    }
  ary[start + a] = save;
  }
}
  // public static void split(int[] data){
  //   int length = 0;
  //   int count = 0;
  //   length = data.length / 2;
  //   temp1 = new int[length];
  //   temp2 = new int[data.length - length];
  //   for (int i = 0; i < length; i++){
  //     temp1[i] = data[i];
  //   }
  //   for (int a = length; a < data.length; a++){
  //     temp2[count] = data[a];
  //     count++;
  //   }
  // }
  // public static void merge(int[] data, int[] data1){
  //   merge = new int[data.length + data1.length];
  //   if (data.length == 1 && data1.length == 1){
  //     if (data[0] >= data1[0]){
  //       merge[0] = data1[0];
  //       merge[1] = data[0];
  //     }
  //     else{
  //       merge[0] = data[0];
  //       merge[1] = data1[0];
  //     }
  //   }
  //   if (data.length > 1 && data1.length > 1){
  //     return;
  //   }
  // }

  public static void main(String[] args) {
//     System.out.println("Size\t\tMax Value\tmerge/builtin ratio ");
//     int[]MAX_LIST = {1000000000,500,10};
//     for(int MAX : MAX_LIST){
//       for(int size = 31250; size < 2000001; size*=2){
//         long qtime=0;
//         long btime=0;
//     //average of 5 sorts.
//     for(int trial = 0 ; trial <=5; trial++){
//       int []data1 = new int[size];
//       int []data2 = new int[size];
//       for(int i = 0; i < data1.length; i++){
//         data1[i] = (int)(Math.random()*MAX);
//         data2[i] = data1[i];
//       }
//       long t1,t2;
//       t1 = System.currentTimeMillis();
//       mergeSort(data2);
//       t2 = System.currentTimeMillis();
//       qtime += t2 - t1;
//       t1 = System.currentTimeMillis();
//       Arrays.sort(data1);
//       t2 = System.currentTimeMillis();
//       btime+= t2 - t1;
//       if(!Arrays.equals(data1,data2)){
//         System.out.println(Arrays.toString(data2));
//         System.out.println("FAIL TO SORT!");
//         System.exit(0);
//       }
//     }
//     System.out.println(size +"\t\t"+MAX+"\t"+1.0*qtime/btime);
//   }
//   System.out.println();
// }
int[] test = {12, 2, 5, 7, 4, 5, 8, 9, 1, 11};
mergesort(test);
System.out.println(Arrays.toString(test));
  }
}
