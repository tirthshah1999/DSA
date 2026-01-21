import java.util.Scanner;

public class AllPrimes {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int lo = scn.nextInt();
    int hi = scn.nextInt();
    for(int i = lo; i <= hi; i++){
        int count = 0;
        for(int div = 2; div * div <= i; div++){
            if(i % div == 0){
                count++;
                break;
            }
        }

        if(count == 0) System.out.println(i);
    }
  }
}
