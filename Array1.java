class Array1
{
	public static void test(int[] marks) 
	{
	double sum = 0.0;
	double avg = 0.0;
	for(int index=0; index<marks.length;index++)
    {
    	sum=sum+marks[index];
    }
    System.out.println("sum ="+sum);
    avg=sum/marks.length;
    System.out.println("avg ="+avg);
    }
    public static void main(String[] args) 
    {
    //datatype[] arrayname= new datatype[size];
    int[] javamarks = new int[4];
    int[] sqlmarks = new int[3];	
    
    javamarks[0]= 10;
    javamarks[1]= 20;
    javamarks[2]= 30;
    javamarks[3]= 40;
     
    sqlmarks[0]= 20;
    sqlmarks[1]= 40;
    sqlmarks[2]= 60;

    test(javamarks);
    test(sqlmarks);
    }
}