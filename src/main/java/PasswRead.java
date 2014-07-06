import java.io.Console;

public class PasswRead {

	public static void main(String[] args) {
		
		System.out.println("Git is cool");
		
		 Console cons;
		 char[] passwd;
		 if ((cons = System.console()) != null &&
		     (passwd = cons.readPassword("[%s]", "Password:")) != null) {
			 
			 System.out.println("Passwd: " + new String(passwd));
			 
		     java.util.Arrays.fill(passwd, ' '); // clearing the passwd in mem after it has been used
		 }	
		
	}

}
