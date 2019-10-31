import java.util.Scanner;
class hashmap_solution{

   static void getOccuringChar(String S)
    {
    	HashMap <Character,Integer> map = new HashMap<>();
    	int n= S.length(),count=0;
    	for(int i=0;i<n;i++)
    	{
    		//check if hashmap already has our searching character
    		if(map.containsKey(S.charAt(i)))
    		{
    			count=map.get(S.charAt(i)); //gets already existing value
    			map.replace(S.charAt(i),count+1); //puts new value which is old value + 1
    		}
    		//if its new char we add to hashmap with value 1
    		else
    			map.put(S.charAt(i),1);
    	}
    	//lets print the map with required output format
   		for (Character i : map.keySet())
   		 {
   		   System.out.print( i + " : " + map.get(i)+"  ");
	         }
    }
	public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine(); 
        getOccuringChar(str); 
    } 

}
