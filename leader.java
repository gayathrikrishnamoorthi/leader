package gayathri;

import java.util.Scanner;

public class leader {
	static void lead(int arr[], int x)
{
	for(int i = 0; i < x; i++)
	{
	int j;
	for(j = i+1; j < x; j++);
	{
		if (arr[i]<=arr[j])
			break;
		}
	if(j == x)
		System.out.println(arr[i]+" ");
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
leader lead = new leader();
int arr[] = new int[] {16,17,4,3,5,2};
int n = arr.length;
lead(arr,n);
	}

}



