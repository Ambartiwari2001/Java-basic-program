//Java Program to multiply two matrices.

public class MatrixMulti {


		public static void main(String[] args) {
			
			int[][] m1= {{1,2,3},{4,3,2},{5,4,6}};
	    	int[][] m2= {{3,1,2},{2,3,2},{7,3,6}};
	    	int[][] m3=new int[3][3];
	    	
	    	for(int i=0;i<3;i++)
	    	{
	    		for(int j=0;j<3;j++)
	    		
	    		{
	    		    for(int k=0;k<3;k++)
	    		    {
	    			m3[i][j]  =m3[i][j] +m1[i][k] * m2[k][j]; 
	    		    }
	    		}
	    	
	    	}
	    	for(int i=0;i<3;i++)
	    	{
	    		for(int j=0;j<3;j++)
	    		
	    		{
	    			System.out.print(m3[i][j]+" "); 
	    		}
	    	  System.out.println();
                }
	
}
}
