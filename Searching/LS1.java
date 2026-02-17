class LS1{
	public static void main(String args[])
	{
	String name = "Dhanshri";
	char target = 'n';
	
	System.out.println(linearSearch1(name ,target));
	}

	public static boolean linearSearch1(String str, char target){
	if(str.length()==0){
	return false;
	}

	for(int i=0;i<str.length();i++){
	if(target==str.charAt(i)){
	return true;
	}
	}
	return false;
	}
}