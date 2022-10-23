
public class IneuronPattern {


			public static void main(String[] args) {
			int n=10;
		//I
				for(int i=0;i<n; i++)
				{
					for(int j=0 ; j<n; j++)
					{
						if(i==n/4|| i==3*n/4 || (j==(n-1)/2 && i>n/4 && i<3*n/4))
					
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
		//N
					for(int j=0 ; j<n; j++)
					{
						if(j==n/4 && i<=3*n/4 && i>=n/4
								||j==(3*n/4) && i<3*n/4&&i>=n/4
								||(i==j)&& i<=3*n/4 && i>=n/4)
						
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
		//E
					for(int j=0 ; j<n; j++)
					{
						if (i == n/4  && j>=n/4 || i == (n - 1) / 2 && j>n/4 || i == (3*n/4) && j>n/4 || (j==n/4 && i>n/4
								 &&i<=3*n/4)) {
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
					
		//U
					for(int j=0 ; j<n; j++)
					{
						if((j==n/4 && i!=(3*n/4) &&i>=n/4  && i<3*n/4
								 )|| (i==(3*n/4)&& j>n/4 && j<3*n/4)||
								(j== 3*n/4 && i!=3*n/4 && i<3*n/4)&&i>=n/4 )
						
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
		//R
					for(int j=0 ; j<n; j++)
					{
						 if( (j==n/4 && i>n/4
								 &&i<=3*n/4) ||(i==n/4) && j>=n/4 && j<3*n/4 ||(i==(n-1)/2) && j>=n/4 &&
								 j<3*n/4 || j==3*n/4 && i!=n/4 && i!=(n-1)/2 && i>n/4 &&i<=3*n/4 )
						
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}

					
		//O
					for(int j=0 ; j<n; j++)
					{
						if( (j==n/4 && i!=n/4 &&
								 i!=3*n/4 && i>n/4 && i<3*n/4) || (i==n/4 && j!=n/4 && j!=3*n/4 && j>n/4 &&
								 j<3*n/4) || (i==3*n/4 && j!=n/4 && j!=3*n/4 && j>n/4 && j<3*n/4) || j==3*n/4
								 && i!=n/4 && i!=3*n/4 && i>n/4 && i<3*n/4)
						
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
		//N
					for(int j=0 ; j<n; j++)
					{
						if(j==n/4 && i<=3*n/4 && i>=n/4
								||j==(3*n/4) && i<3*n/4&&i>=n/4
								||(i==j)&& i<=3*n/4 && i>=n/4) 
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
							
						}
						
					}
					
System.out.println();
	}
			}
		}


	