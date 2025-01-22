import java.util.List;
import java.util.ArrayList;
public class isprimenumber {
  public static boolean isPrime (int n){
   if (n<=1 && !(n<0)){
    return false;
   }
   for (int i =2;  i <n ; i++){
    if (n % i ==0){
      return false;
    }
   }
   return true;
       
   }

   public static List displayPrimes (int n){
    List<Integer> primes = new ArrayList<>();
    for (int i=2;i<n;i++){
      if (isPrime(i)){
        primes.add(i);
      }
    }
    return primes;
  }
  
   public static void main(String[] args) {
       System.out.println(isPrime(26));
       System.out.println(displayPrimes(43));
   }
  }

