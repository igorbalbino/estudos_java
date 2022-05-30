import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PontoFlutuante  {
	List<Double> doubleList = new ArrayList<Double>();
	boolean segueVai = true;
	
	public PontoFlutuante() throws IOException {
		// Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
 
        while(segueVai){
			// Reading data using readLine
			String numero = reader.readLine();
			
			if(numero.equals(0)){
				System.out.println("BUT");
			}else{
				doubleList.add(Double.parseDouble(numero));
			}
	 
			// Printing the read line
			System.out.println(doubleList);
		}
	}
	
	public static void main(String[] args) throws IOException
    {
        new PontoFlutuante();
    }
}