package Assignments;

import java.util.*;

public class SearchaString12 {
	public static void main(String[] args)
	{
		String[] str= {"Manoj","Vikram"};
		boolean found=false;
		int index=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=s.nextLine();
		
		for(int i=0;i<str.length;i++)
		{
			if(a.equals(str[i]))
			{
				index=i;
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println(a+" found at the index "+index);
		}
		else
		{
			System.out.println(a+" not found in the array");
		}
	}

}
