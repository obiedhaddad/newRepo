import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> arr;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * counstrctor 
	 * @param arr array contains the entered values
	 * @param b is value we want to check if there is a sum that is equal to
	 */
	public SharedData(ArrayList<Integer> arr, int b) {
		
		this.arr = arr;
		this.b = b;
	}

	/**
	 * @return return true for the winning array
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray set the winning array 
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return it returns the array
	 */
	public ArrayList<Integer> getArray() 
	{
		return arr;
	}

	/**
	 * @return returns the value of the parameter b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return it returns the value of the flag 
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 * sets the flag to a input
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
