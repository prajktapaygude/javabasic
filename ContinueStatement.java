package Loops;

public class ContinueStatement {

	public static void main(String[] args) {
	  int i ;
	  for(i=1;i<20;i++)
	  {
		  if(i==15)
			  continue;
		  else
			  System.out.print(i+" ");
	  }
System.out.println("\n \n out of loop");
	}

}
