 
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class SSTF {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the head position : ");
        int head = sc.nextInt();
        System.out.print("Enter the nubmer of requests : ");
        int n = sc.nextInt();
        ArrayList<Integer> requests = new ArrayList<>(n);
        System.out.println("Enter requests");
        for (int i = 0; i < n; i++) {
            requests.add(sc.nextInt());
        }
        displaySolution(head,requests);
    }
 
    static int displaySolution(int head, ArrayList<Integer> list) {
        int totalHeadMovements = 0;
        int n=list.size();
        for (int i = 0; i < n; i++) {
            int index=0,val=abs(head-list.get(index));
            for (int j = 1; j < list.size(); j++) {
 
                if(abs(head-list.get(j))<val){val=head-list.get(j);index=j;}
            }
            System.out.println("head moved from "+ head + " to position "+list.get(index)+" in : "+(abs(list.get(index)-head)));
            totalHeadMovements += (abs(list.get(index)-head));
           head=list.remove(index);
        }
        System.out.println("total head movements : "+totalHeadMovements);
        return totalHeadMovements;
    }
 
}