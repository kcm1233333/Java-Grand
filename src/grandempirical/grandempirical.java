package grandempirical;

//import java.util.Scanner;

public class grandempirical {
	
	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	 void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }//print the values from sorting func
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asr="98332215565";
		char res=asr.charAt(0);
		for(int i=0;i<10;i++) {
		   //if (Integer.parseInt(asr,)) {}   
		}
		//Number One 
		grandempirical gec=new grandempirical();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
        gec.bubbleSort(arr);
        System.out.println("Sorted array");
        gec.printArray(arr);
		//Number Two
		int [] randomArray= {9,8,6,2,3,4,8,7,5,3,2,4};
		int countArray[]=new int[randomArray.length];
		int max=randomArray[0];
		for (int r : randomArray) 
		    countArray[r]++;
	   	for(int i=0;i<randomArray.length;i++)
	   		if (randomArray[i]>max)
	   			max=randomArray[i];
		for (int x = 0; x <=max; x++) {
		    System.out.println("" + x + " occurs " + countArray[x] + " times");
		}
		//System.out.println(res);
		//Number Three
		String str   = "James Bond";  
        int numberOfWords = str.split(" ").length;
        String reducedPhrase = str;
         
        for(int i=0; i<numberOfWords-1; i++) {
            reducedPhrase = reducedPhrase.split(" ", 2)[1];
            //System.out.println("reducedPhrase:"+ reducedPhrase);
        }
        //Number Three
        String st = "James Bond";
        String[] splitStr = st.split("\s");//regex
        for (int i=0;i<splitStr.length;i++) {
        	System.out.print(splitStr[i]+ ((i==splitStr.length-1)?"  ":"  and  "));
        	//if (i<splitStr.length) {System.out.print(splitStr[i]+" and "+splitStr[i+1]); break; }
        }
        System.out.println();
     
	}
}

