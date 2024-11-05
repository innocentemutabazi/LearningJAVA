public class primenumber {
  public  static int [] primes(int num){
    int count =0;
    StringBuilder sb = new StringBuilder();
    for (int i=0;i<num;i++){
      for (int j=0;j<num/2;j++){
        if(j % i !=0){
          sb.append(i);
          count++;
        }
      }

    }
    int [] result = new int[count];
    for (int)
  }
}
