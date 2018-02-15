package arrays;

public class FindPermutation {

	public static void main(String[] args) {
		String s="DIDDDDDD";
		FindPermutation obj=new FindPermutation();
		obj.findPermutation(s);

	}

	 public int[] findPermutation(String s) {
		 
		 int[] perm=new int[s.length()+1];
		 String swapCheck="";
		 if(s.startsWith("I"))
		 { 
			 swapCheck="D";
			 for(int i=1;i<=s.length()+1;i++)
				 perm[i-1]=i;	
		 }
		 else
		 { 
			 swapCheck="I";
			 for(int i=1, j=s.length()+1;i<=s.length()+1;i++,j--)
				 perm[i-1]=j;
		 }
		 
		 
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 String check=""+s.charAt(i);
			 if(check.equals(swapCheck))
			 {
				 //swap
				 int temp=perm[i];
				 perm[i]=perm[i+1];
				 perm[i+1]=temp;
			 }
		 }
				 
		 for (int i : perm) {
			System.out.println(i);
		}
		 
		return perm;
		 
	 }
}
