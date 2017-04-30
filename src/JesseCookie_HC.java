import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseCookie_HC {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.offer(scan.nextInt());
        }
        int numOfMix = 0;
        while(pq.peek()<k){
            int mix1 = pq.poll();
            int mix2 = pq.poll();
            int mixed = mix1+(2*mix2);
            numOfMix+=1;
            pq.offer(mixed);
        }
        
        System.out.println(numOfMix);
    }
}
