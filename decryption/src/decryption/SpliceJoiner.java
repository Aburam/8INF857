//Join plusieurs  splices en un seul texte, en prenant une lettre de chacune � tour de role.

package decryption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SpliceJoiner {
	
	private static BufferedReader in =null;
	private static String file = ".\\Splices.txt";
	private	static ArrayList<String> splices= new ArrayList<String>();

	
	
	public static void main(String[] args) {

		
		try {
			readfile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String text =merge();
		System.out.println(text);
	
	}

	private static void readfile() throws IOException
	{		
			in = new BufferedReader(new FileReader(file)) ;
			String line;
			while ((line = in.readLine()) != null)
			{
				splices.add(line); 
			}
			System.out.println(splices);
	}
	
	private static String merge() 
	{
		String text = "";
		int idx=0;;
		while(idx<splices.get(0).length())
		{
			for(int i=0;i<splices.size();i++)
			{
				if(idx<splices.get(i).length())
					text=text+splices.get(i).charAt(idx);
				System.out.println(text);
			}
			idx++;
		}
		return text;
	}

	
	
}
