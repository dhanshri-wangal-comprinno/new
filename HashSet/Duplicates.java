import java.util.*;
public class Duplicates
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		HashSet<Integer> set=new HashSet<>();
		boolean f=false;
		for(int num:arr)
		{
		   if(!set.add(num))
		   {
		       f=true;
		   }
		}
		System.out.println(f);
	}
}