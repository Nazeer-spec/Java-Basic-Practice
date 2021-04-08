class Array
{
	public static void main(String[] args) 
	{
	int[] marks= new int[4];
	double sum = 0.0;
	double avg = 0.0;
    
	System.out.println(marks);

	System.out.println(marks[0]);
	marks[0]= 10;
    marks[1]= 20;
    marks[2]= 30;
    marks[3]= 40;

    System.out.println(marks[0]);

    for(int index=0; index<=3;index++)
    {
    	sum=sum+marks[index];
    }
    System.out.println(sum);
    avg=sum/4;
    System.out.println(avg);

	}
}