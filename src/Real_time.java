/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Chaotic
 */
public class Real_time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int head=0;
     int number_of_requests;
     Vector<Integer>requests =new Vector<Integer>();
     System.out.print("Enter the number of requests :");
     number_of_requests=input.nextInt();
     System.out.print("Enter the requests:");
     for(int i=0,temp;i<number_of_requests;i++)
     {
         temp=input.nextInt();
         requests.addElement(temp);  
     }
     Collections.sort(requests);
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
        System.out.println();
    return totalheadmovements;
    }
    
}
