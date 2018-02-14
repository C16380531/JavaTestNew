package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook
{
    ArrayList<String> tunes = new ArrayList<String>();

	public String toString()
    {
        StringBuffer sb = new StringBuffer();
        for(String tune:tunes)
        {
            sb.append(tune + ", ");
        }

        return sb.toString();
    }
	
	public String findClosest(String tune)
    {
        int closestEd = Integer.MAX_VALUE;
        String closestTune = ""; 
        for(String w:tunes)
        {
            
            if (tune == w)
            {
                return tune;
            }
            
        }
        return(null);
    }
	
	public void loadTunes(String file)
    {
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(file));
            
            String l;
            while ((l = inputStream.readLine()) != null) {
                tunes.add(l);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
	public void TuneBook(String file)
    {
		loadTunes(file);
	}
	
	public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        //Tune t = tb.findTune("Scotsman over the Border");
        //t.play();
    }
}    