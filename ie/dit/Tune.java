package ie.dit;

public class Tune
{
	private int x;
	public String title,altTitle,notation;

	
	public String toString()
	{
		if(altTitle.length()>0)
		{
			return x + ", " + title + " " + altTitle;
		}
		else
		{
			return x + ", " + title;
		}
	}
}