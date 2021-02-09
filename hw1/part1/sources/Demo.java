import java.util.Scanner;
import java.io. *;

/**
* This is a demo class. It starts the program to test implementations.
*/
public class Demo{
	public static void main(String[] args){
 
		int i, choice, k=0, l=0, j;
        String line = "";
        String vars = "";

		try{
			BufferedReader reader = new BufferedReader(new FileReader(args[0]));
			int lines = 0, bCount=0;
			while ((line = reader.readLine()) != null)
			{
				lines++;
				for(i=0 ; i<line.length() ; i++)
				{
					if(((int)(line.charAt(i)))>=65 &&  ((int)(line.charAt(i)))<=122 && (!vars.contains(String.valueOf(line.charAt(i)))))
					{
						vars += line.charAt(i);
					}
				}
			}
			//Matrix for coefficients and an array for right side of the equations
   			double [][]matrix = new double[lines][lines]; 
        	double[] bside = new double[lines];

			reader.close();	
			for(i=0 ; i<lines ; i++)
			{
				for(j=0 ; j<lines ; j++)
				{
					matrix[i][j] = 0.0;
				}
			}

			reader = new BufferedReader(new FileReader(args[0]));
		
			line = reader.readLine();
			String temp = "";
			while (line != null) {

				for(i=0 ; i<line.length() ; i++){
					if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
						temp+=line.charAt(i);
					else{
						if(line.charAt(i-1)!='-')
						{
							if(vars.contains(String.valueOf(temp.charAt(temp.length()-1))))
							{
	
								for(l=0 ; l<vars.length() ; l++)
								{
									if(vars.charAt(l) == temp.charAt(temp.length()-1))
									{
										if(temp.length()==1)
										{
											matrix[k][l] = 1.0;
											l++;
										}	
										else if(temp.charAt(0)=='-' && (vars.contains(String.valueOf(temp.charAt(1)) )))
										{
											matrix[k][l] = -1.0;
											l++;
										}	
										else
										{
											matrix[k][l] = Integer.parseInt(temp.substring(0, temp.length() - 1));
										}

									}
								}
							}
							temp = "";
						}

					}
				}
				k++;
				bside[bCount] = Integer.parseInt(temp);
				bCount++;
				temp="";		

				line = reader.readLine();
			}
			reader.close();
			
		double[] solution; 
		Context ctx;

		System.out.println("\n-----------------------\nPlease choose a method for solving linear equations:\n");
		System.out.println("Type 1 for Gaussian Elimination");
		System.out.println("Type 2 for Matrix Inversion");

		Scanner myInput = new Scanner( System.in );

		System.out.print( "\nChoice: " );
		try{
			choice = myInput.nextInt();
			while(choice!=1 && choice!=2)
			{

				System.out.println( "\n----------------------\nThis is not a choice try again.\n" );
				System.out.println("Type 1 for Gaussian Elimination");
				System.out.print("Type 2 for Matrix Inversion\nChoice: ");
				choice = myInput.nextInt();
		
			}

			if(choice == 1)
				ctx = new Context(new Gaussian());
			else
			    ctx = new Context(new MatrixInversion());

			solution = ctx.calculate(matrix, bside);

			System.out.println("---------------------------\nSolution:");



			for(i=0 ; i<solution.length ; i++)
       			 System.out.println("x"+(i+1)+": "+String.format("%.3f",solution[i]));

		}
		catch(Exception e)
		{
				System.out.print( "\nThis is not even an integer! "+e );

		}
		}
		catch(Exception e){
			System.out.print("\nWe can not do this calculation. "+e);		

		}



















	}
}
