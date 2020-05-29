/**
 * 
 * @author Ryan Greiser & Logan Davison
 *
 *
 */
public class EelDice 
{

	//true -> esclator
	//false -> eel
	public boolean roll()
	{
		int num = (int)(Math.random()*2);
		return num == 0;
	}
	
	
}
