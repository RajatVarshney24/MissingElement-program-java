//import java.ulit.*;
class missing
{ 
	static int getmissingelement(int a[],int n)
	{
		int total=(n+1)*(n+2)/2;
		for( int i=0;i<n;i++)
		 total = total-a[i];
		return total;
	}
	public static void main(String args[])
	{
		int arr[]={1,2,4,5,6};
		int mis=getmissingelement(arr,5);
		System.out.println(mis);
	}
}