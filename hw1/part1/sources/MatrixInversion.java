public class MatrixInversion implements Strategy{
  
	/** 
	* Function to get cofactor of A[p][q] in temp[][]. n is current 
	*/
	public static void Cofactor(double A[][], double temp[][], int p, int q, int n) 
	{ 
	    int i = 0, j = 0, r, c; 
	    for (r = 0; r < n; r++) 
	    { 
	        for (c = 0; c < n; c++) 
	        { 
	            if (r != p && c != q) 
	            { 
	                temp[i][j++] = A[r][c]; 
	                if (j == n - 1) 
	                { 
	                    j = 0; 
	                    i++; 
	                } 
	            } 
	        } 
	    } 
	} 
	  
	/*
	* A recursive function to find the determinant. 
	* */
	public static double determinant(int N, double A[][], int n) 
	{ 
	    double D = 0.0; 
	  
	  	if (n == 1) 
	        return A[0][0]; 
	  
	    double [][]temp = new double[N][N]; // To store cofactors 
	  
	    int sign = 1; // To store sign multiplier 
	  
	    for (int f = 0; f < n; f++) 
	    { 
	        // Getting Cofactor of A[0][f] 
	        Cofactor(A, temp, 0, f, n); 
	        D += sign * A[0][f] * determinant(N, temp, n - 1); 
	  
	        // terms are to be added with alternate sign 
	        sign = -sign; 
	    } 
	  
	    return D; 
	} 
	  
	/*
	*This function gets adjoint of A[N][N] in adj[N][N]. 
	*/
	public static void adjoint(int N, double A[][],double [][]adj) 
	{ 
		int i, j, sign;
	    if (N == 1) 
	    { 
	        adj[0][0] = 1; 
	        return; 
	    } 
	  
	    sign = 1; 
	    double [][]temp = new double[N][N]; 
	  
	    for (i = 0; i < N; i++) 
	    { 
	        for (j = 0; j < N; j++) 
	        { 
	            Cofactor(A, temp, i, j, N); 
	  
	            sign = ((i + j) % 2 == 0)? 1: -1; 
	  
	            adj[j][i] = sign*(determinant(N, temp, N-1)); 
	        } 
	    } 
	} 
	  
	public static boolean inverse(int N, double A[][], double [][]inverse) 
	{ 

	    // Find the determinant  
	    double det = determinant(N, A, N); 
	    if (det == 0) 
	    { 
	        System.out.print("Cannot be found its inverse!"); 
	        return false; 
	    } 
	  
	    double [][]adj = new double[N][N]; 
	    adjoint(N, A, adj); 
	    int i, j;
	  
	    // Find inverse of the matrix.
	    for ( i = 0; i < N; i++) 
	        for ( j = 0; j < N; j++) 
	            inverse[i][j] = adj[i][j]/(float)det; 
	  
	    return true; 
	}  


	/**
	*	This method gets 2 matrix and returns the multiplycation of them.
	*/
	public static double[] multiplier(double[] matrix1, double[][] matrix2){

	    int i,j,k;
	    double c[]=new double[3];  //3 rows and 3 columns  
	    

	    for(i=0 ; i<3; i++){
	        c[i]=0;
	    }


	    k=0;
	    for( i=0;i<3;i++){  
	        for( j=0 ; j<3 ; j++){ 
	          c[k] += matrix2[i][j]*matrix1[j];
	        }
	        k++;
	    }    


	    return c;
	}
  
  	/*
	* Starts the calculation.
  	*/
	public double[] calculation(double arr[][], double b[]){
	
		double[]  solution; 
		int N = b.length;
		double [][]inv = new double[N][N]; // To store inverse of A[][] 

		if (inverse(N, arr, inv)) 
	 		return multiplier(b,inv);
	 	else 
	 		return null;
	
	 }
}