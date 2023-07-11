package com;

import java.util.*;
import java.io.*;
class demo2
{
	public static void main(String args[])
	{
		String line =null;
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter file name: ");
			String fname = br.readLine();

			File f = new File(fname);
			if(f.exists())
			{
				BufferedReader fr= new BufferedReader(new FileReader(fname));
				while((line=fr.readLine())!=null)
				{
					System.out.println(line);
				}
			}
			else
				{
					System.out.println("Sorry...!file not exists");
				}
		}
		catch(Exception e)
		{
		}
	}
}
