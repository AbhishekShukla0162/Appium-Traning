package aboutEnum;

// We can define enum outside class and inside class 
// we can not defined enum inside the method 


enum color
{
   red,blue,green,yello;
} 

public class First {
	
	/*enum color
    {
	   red,blue,green,yello;   // We can defined here 
	} 
	
*/
	public static void main(String[] args) {
		
		/*enum color
		{
		   red,blue,green,yello;  // We can not define here 
		} */

		
		
		color c =  color.red;	
				System.out.println(c);
				System.out.println(color.red);
				System.out.println(color.green);
				
				for(color c1 : color.values()) {
					System.out.println(c1);
				}
	}

}
