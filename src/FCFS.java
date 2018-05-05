
/**
 *
 * @author Chaotic
 */
import java.util.*;
public class FCFS {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int head=0;
     int number_of_requests;
     Vector<Integer>requests =new Vector<Integer>();
     System.out.print("Enter the head inital place :");
     head=input.nextInt();
     System.out.print("Enter the number of requests :");
     number_of_requests=input.nextInt();
     System.out.print("Enter the requests:");
     for(int i=0,temp;i<number_of_requests;i++)
     {
         temp=input.nextInt();
         requests.addElement(temp);  
     }
        displaySoultion(head, requests);
     
     
    }
    public static int displaySoultion(int head ,Vector<Integer>requests){
    int totalheadmovements=0;
    int n=requests.size();
    for(int i=0;i<n;i++){
        int movement=Math.abs(head-requests.elementAt(i));
        System.out.println("head moved from "+head +" to position : "+requests.elementAt(i)+" in : "+movement);
        totalheadmovements+=movement;
        head=requests.elementAt(i);
    }
    
        System.out.print("Total head movement : "+totalheadmovements+" Cylinders");
    return totalheadmovements;
    }
    
}
