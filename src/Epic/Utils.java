package Epic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utils {
	
	public static List<String> readFromFile (File file) throws IOException
	{
		List<String> result = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		while((line = br.readLine()) != null)
		{
			String sentence = line.trim();
			result.add(sentence);
		}
		br.close();
		return result;
	}
	
	public static int getMaxLengthOfCharArray (List<char[]> array)
	{
		int maxLenth = Integer.MIN_VALUE;
		for(char [] chArray : array)
		{
			if(chArray.length > maxLenth)
				maxLenth = chArray.length;
				
		}
		
		return maxLenth;
	}
}
