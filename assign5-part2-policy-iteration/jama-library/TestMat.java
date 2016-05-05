/*  Sample program to solve linear systems using Jama package

    Stephen Majercik
*/

public class TestMat  {

     public static void main(String[] args)  {


	 // make 2-dim array for matrix of coefficients
         double[][] ma = {{  1.0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0 },
                          {    0,  1.0,    0,    0,    0,    0,    0,    0,    0,    0,    0 },
                          {    0,  0.1, -0.9,    0,    0,  0.8,    0,    0,    0,    0,    0 },
                          {  0.8,    0,    0, -0.9,  0.1,    0,    0,    0,    0,    0,    0 },
                          {    0,  0.1,    0,  0.8, -0.9,    0,    0,    0,    0,    0,    0 },
                          {    0,    0,    0,    0,  0.1, -0.9,    0,  0.8,    0,    0,    0 },
                          {    0,    0,    0,  0.8,    0,    0, -0.8,    0,    0,    0,    0 },
                          {    0,    0,    0,    0,    0,    0,    0, -0.8,    0,    0,  0.8 },
                          {    0,    0,    0,    0,    0,    0,  0.8,    0, -0.9,  0.1,    0 },
                          {    0,    0,    0,    0,    0,    0,    0,    0,  0.8, -0.8,    0 },
                          {    0,    0,    0,    0,    0,    0,    0,  0.1,    0,  0.8, -0.9 }};

 	 // make 2-dim array (but only one column) for right-hand side 
         double[][] ba = {{1.0}, {-1.0}, {0.04}, {0.04}, {0.04}, {0.04},
                                {0.04}, {0.04}, {0.04}, {0.04}, {0.04}};

	 // create matrices from the 2-dim arrays
         Matrix M = new Matrix(ma);
         Matrix B = new Matrix(ba);

	 // solve the matrix equation MX = B
         Matrix X = M.solve(B);

	 // print out the solution with columns that are 8 characters 
	 // wide and with 5 digits after the decimal point
         System.out.println("Solution:");
         X.print(8, 5);

     }  // main


}  // class


