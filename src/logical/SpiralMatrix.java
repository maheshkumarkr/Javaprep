package logical;

import java.util.Scanner;


public class SpiralMatrix {

	/**
	 * @param args
	 */
	
	int arr[][];
	
	//int loopCounter = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * To Generate Spiral Matrix Pattern
		 * 
		 * 	1 1 1 1 1 1 1 1 1		1 1 1 1 1 		1 1 1 1 1 1 1
        	1 2 2 2 2 2 2 2 1		1 2	2 2	1       1 2 2 2 2 2 1
        	1 2 3 3 3 3 3 2 1		1 2	3 2	1		1 2	3 3 3 2	1
        	1 2 3 4 4 4 3 2 1		1 2 2 2	1		1 2	3 4 3 2	1
        	1 2 3 4 5 4 3 2 1		1 1 1 1 1		1 2	3 3	3 2	1
        	1 2 3 4 4 4 3 2 1						1 2	2 2 2 2 1
        	1 2 3 3 3 3 3 2 1						1 1 1 1 1 1 1
        	1 2 2 2 2 2 2 2 1
        	1 1 1 1 1 1 1 1 1
        	
        	Indicates => for every N = there will be (N+(N-1)) X (N+(N-1)) matrix of numbers to be formed in a spiral
        	
		 */
		SpiralMatrix matrix = new SpiralMatrix();
		matrix.init();
		
	}
	
	public void init(){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter N");
		
		int N=0;
		try{
		N = in.nextInt();
		in.close();
		if(N > 9 || N <= 0)
			throw new NumberFormatException();
		generateSpiral(N);
		}
		catch(NumberFormatException e){
			System.out.println("Please enter positive integer;preferably less than 9");
		}
		
		
		//generateSpiralNaive(N);
		
		//System.out.println("Efficient Method ::");
		
		
		
		//System.out.println("Loop Counter:"+loopCounter);
	}
	
	public String generateSpiralNaive(int N){
		
		int MatrixNum = N+N-1;
		
		arr = new int[MatrixNum][MatrixNum];
		
		for(int i=0;i<MatrixNum;i++){
			for(int j=0;j<MatrixNum;j++){
				arr[i][j]=0;
			}
		}
		System.out.println("Init Print");
		printSpiral(MatrixNum);
		
		
		
		int printNum = 0;
		
		/*
		 * Naive method, use 3 loops - one loop for total number of rows = N+N-1 -> M
		 * Other 2 loops to print numbers in each index
		 * 
		 * Approach: Inward Spiral; 
		 * print 1 @ all positions in 1st row,Mth row, 1st col, Mth col
		 * print 2 @ all positions in 2nd row,M-1th row(2nd Row from end); 2nd col,M-1th col - consider all numbers that are not printed earlier.
		 * ..
		 * ..
		 * ..
		 * print N @ all positions that are not filled earlier according to previous conditions.
		 * 
		 */
		
		for(int k=1;k<=N;k++){
			printNum++;
		for(int i=0;i<MatrixNum;i++){
			for(int j=0;j<MatrixNum;j++){
				
				if((i==printNum-1 || i==MatrixNum-printNum) || (j==printNum-1 || j==MatrixNum-printNum))
				{
					if(arr[i][j]==0)
					arr[i][j]=printNum;
				}
				
			}
		}
		}
		System.out.println("Final Print");
		printSpiral(MatrixNum);
		
		return "Pattern printed successfully";
	}
	
	public void generateSpiral(int N){
		
		// Pattern generation for N - will have N+N-1 rows ex: N=5 will have 5+4 = 9 -> M rows of spiral numbers
		
		int noOfRows = N+N-1; 
		
		for(int i=1;i<=noOfRows;i++){ // For Total No of Rows
			
			// Logic is to print first N-1 rows forward - > print 1 to i; then print i for M-(i*2) times; then print i to 1 in revers 
			// Nth Row Spl Case - print (1 to N) forward (N-1 to 1) in reverse,
			// next N-1 rows in reverse of 1st case
			if(i<N){ // for first N-1 rows
				for(int j=1;j<=i;j++){ // Initial series
					System.out.print(j+" ");
				}
				for(int j=1;j<=(noOfRows-(i*2));j++){ // Continuous Numbers
					System.out.print(i+" ");
				}
				for(int j=i;j>=1;j--){
					System.out.print(j+" ");
				}
				System.out.println();
			}
			else if(i==N){
				// Special case for Nth Row
				for(int j=1;j<=N;j++){
					System.out.print(j+" ");
				}
				for(int j=i-1;j>=1;j--){
					System.out.print(j+" ");
				}
				System.out.println();
			}
			else{ //for rest of the bottom N-1 rows
				int primaryNumber = noOfRows - i+1;
				for(int j=1;j<=primaryNumber;j++){ // Initial series
					System.out.print(j+" ");
				}
				for(int j=1;j<=(noOfRows-(primaryNumber*2));j++){ // Continuous Numbers
					System.out.print(primaryNumber+" ");
				}
				for(int j=primaryNumber;j>=1;j--){
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
		}
		
	}
	
	public void printSpiral(int M){
		
		for(int i=0;i<M;i++){
			for(int j=0;j<M;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
