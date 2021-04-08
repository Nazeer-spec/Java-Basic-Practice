class Array4loop
{
	//{20,40,10,50,30}
	public static int[] test(int arr[]) 
	{
		int n=arr.length;
		for(int i=0; i<n-1; i++)
		{
			for (int j=0; j<n-i-1; j++)
			{
				if(arr[j]<arr[j+1])//For ascending Order
				//if(arr[j]<arr[j+1]) = For Descending Order
				{
					//swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

					
				}

			}
			
		}
		return arr;
	}
	public static void main(String[] args) 
	{

		int[] array1= new int[5];

		array1[0]=20; array1[1]=40; array1[2]=10; array1[3]=50; array1[4]=30;

		test(array1);
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}

	}
}