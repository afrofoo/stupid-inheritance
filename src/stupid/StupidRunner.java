package stupid;

public class StupidRunner
{
 public static void main(String [] args)
 {
	 Dumb lloyd = new Dumb();
	 Dumber harry = new Dumber();
	 
	 System.out.println("Lets test inheritance!");
	 
	 System.out.println("llyd is dumb and his blerg is " + lloyd.getBlerg());
	 System.out.println("harry is dumber and his blerg is: " + harry.getBlerg());
	 System.out.println("Lets test more inheritance!");
	 harry.setBlerg(45);
	 System.out.println("harry is dumber and his blerg is: " + harry.getBlerg());
	 System.out.println("lloyd is dumb and his blerg is: " + lloyd.getBlerg());
	 System.out.println
 }
}
