class simple_solution{

   static void getOccuringChar(String S)
     {
   		int n =S.length();
		char c[]= new char[n];
		c= S.toCharArray();
		int count;
		for(int i=0;i<n;i++)
		{
			if(c[i]=='0')
		    continue;
			count=1;
		    for(int j=i+1;j<n;j++)
			{	
				if(c[i]==c[j])
				{
				count++;
				c[j]='0';
				}
			}
		System.out.print(c[i] + " : "+count+"  ");
		}
	}
	public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine(); 
        getOccuringChar(str); 
    } 

}
