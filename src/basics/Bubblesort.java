package basics;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] liste = {3,2,6,9,1,2,8,5,3,1};
		int temp = 0;
		for(int i=0; i < liste.length; i++){  
		 for(int j=1; j < liste.length; j++){  
             if(liste[j-1] > liste[j]){  
            	 temp = liste[j-1];  
                 liste[j-1] = liste[j];  
                 liste[j] = temp;                
             }	
    }  			
	}									
	 for(int i=0; i < liste.length; i++){  
         System.out.print(liste[i]); }}}


