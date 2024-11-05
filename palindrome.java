public class palindrome {
  public static boolean pal (String a){
    StringBuilder sb = new StringBuilder(a);
    return sb.reverse()==sb;
  }
  public static void main(String[] args) {
      System.out.println(pal("madam"));
  }
}
