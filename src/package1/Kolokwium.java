package package1;

import java.util.ArrayList;

public class Kolokwium{

	/**
	* Metoda służy do pomnożenia  trzech liczb z danej tablicy, gdzie muszą sie znaleźć 
	* wszystkie możliwości mnożenia trzech liczb z danej tablicy.
	* @param A dana tablica zawierająca liczby.
	* @return result jest to lista wyników mnożeń.
	*/ 
	static ArrayList<Integer>  productOfTriplet(int[] A)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		int N = A.length;
		for(int P = 0 ;P < N - 2;P++ )
		{
			for (int Q = P+1; Q < N -1 ;Q++)
			{
				for ( int R = Q+1; R < N ;R++)
				{
					result.add(A[P]*A[Q]*A[R]);
				}
			}
		}
		return result;
	}
	
	/**
	* Metoda służy do znalezienia maksymalnej wartości z danej listy.
	* @param result dana lista zawierająca liczby.
	* @return  max jest to maksymalna wartość z listy.
	*/ 
	static int maximumOfResult(ArrayList<Integer> result)
	{
		int max = 0;
		for (int i : result) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}
}
