/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private void findSubArray(int arr[], int sum){
        int total = 0, start = 0, end =0;
        for(int i = 0; i<arr.length;i++){
            total += arr[i];
            if(total == sum){
                end = i;
                System.out.println((start+1) + " " + (end+1));
                return;
            } else if(total > sum){
                total -= arr[start];
                start++;
                if(total == sum){
                    end = i;
                    System.out.println((start+1) + " " + (end+1));
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
	public static void main (String[] args) {
	    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int sum = 15; 
		GFG gfg = new GFG();
		gfg.findSubArray(arr, sum);
	}
}