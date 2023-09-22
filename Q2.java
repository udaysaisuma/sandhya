class Q2
{
	public static void main(String[]args){
		if(args.length==0 || args[0].length()<5)
		{
			System.out.println("pls supply one int command line argmnts with min 5 digits  ");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = (i% 100)/10;
		System.out.println("last 2nd digit:"+j);
	}
}