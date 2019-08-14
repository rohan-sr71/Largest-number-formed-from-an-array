import java.lang.*;
import java.io.*;

class Hello 
{
	public static void main (String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n>0)
		{
		    n--;
		    int size=Integer.parseInt(br.readLine());
		    String str[]=br.readLine().trim().split("\\s+");
		    ArrayList<String> al=new ArrayList<>();
		    for(int i=0;i<size;i++)
		    {
		        al.add(str[i]);
		    }
		    Collections.sort(al,new Comp());
		    
		    for(String i:al)
		    {
		        System.out.print(i);
		    }
		    System.out.println();
		}
	}
	
	public static class Comp implements Comparator<String>
	{
	    public int compare(String str1,String str2)
	    {

	        return -Integer.compare(Integer.parseInt(str1+str2),Integer.parseInt(str2+str1));
	    }
	}
}
