/**
* This class solves linear equatons usin Gaussian Elimination
*/
public class Gaussian implements Strategy{
    /** 
    * Function to get cofactor of A[p][q] in temp[][]. n is current 
    */	 
	 public double[] calculation(double arr[][], double b[]){
	 
        int p, i, n = b.length;
        double[] x;
        double sum, eps = 1e-10;

        for (p = 0; p < n; p++) {

            int max = p;
            for (i = p + 1; i < n; i++) {
                if (Math.abs(arr[i][p]) > Math.abs(arr[max][p])) {
                    max = i;
                }
            }
            double[] temp = arr[p]; arr[p] = arr[max]; arr[max] = temp;
            double   tx    = b[p]; 

            b[p] = b[max]; b[max] = tx;

            if (Math.abs(arr[p][p]) <= 1e-10) {
                throw new ArithmeticException("This matrix cannot be calculated!");
            }

            for (i = p + 1; i < n; i++) {
                double alpha = arr[i][p] / arr[p][p];
                b[i] -= alpha * b[p];
                for (int j = p; j < n; j++) {
                    arr[i][j] -= alpha * arr[p][j];
                }
            }
        }

        x = new double[n];

        for (i=n-1 ; i>=0 ; i--) {
            sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += arr[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / arr[i][i];
        }
        return x;
	 }
}