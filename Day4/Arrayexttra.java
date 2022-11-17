package Day4;

public class Arrayexttra {
	
	//creating a method which receives an array as a parameter  
	public void min(int arr[]){  
	int min=arr[0];  
	
	for(int i=1;i<arr.length;i++)  
	 if(min>arr[i])  
	  min=arr[i];  
	  
	System.out.println(min);  
	}  
	  
	
	
	public static void main(String args[]){  
	int a[]={33,3,4,5};//declaring and initializing an array  
     Arrayexttra f = new Arrayexttra();
     
	f.min(a);//passing array to method  
	
}
}
