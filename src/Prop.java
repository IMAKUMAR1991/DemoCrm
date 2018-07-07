import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


class propt{
	propt(String s) throws Throwable{
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("E:\\My Programs\\lpg\\Interview\\PROPERTIES\\abc.properties");
	prop.load(fis);
    String usn=prop.getProperty(s);
    System.out.println(usn);
}
}
public class Prop {

	public static void main(String[] args) throws Throwable {
     propt po = new propt("username");
		
		
       	}
}
