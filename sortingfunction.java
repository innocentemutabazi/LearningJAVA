import java.util.Arrays;
public class sortingfunction {

  public static int[] sortarray (int[] a){
  int count=0;
  int []b = new int[a.length];
  for (int i=a.length-1;i>=0;i--){
   b[count] = a[i];
   count++;
  }
   return b;
  }
public static void main(String[] args) {
int[] arr = sortarray(new int[]{1,23,4,5,19,34});
    System.out.println(Arrays.toString(arr));
}
}
