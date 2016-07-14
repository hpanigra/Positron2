//	SINGLE TYPE IMPORT
import static com.cg.MyUtilities.m1;

import com.cg.MyUtilities;


//	TYPE IMPORT ON DEMAND
//import static com.cg.MyUtilities.*;
//import static com.cg.MyUtilities.m2;

public class Entry {
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public static void main(String[] args) {
		
		int distance = 90;
		
		System.out.println("distance is "+  distance);

		assert (distance >= 0);
		
		System.out.println("Some logic is being executed....");
		
		distance = -89;
		
		assert (distance >= 0);
		
		System.out.println(distance);
		System.out.println("end of main()...");
		
		com.cg.MyUtilities.m1();
		
		m1();
		
		MyUtilities.m2();
		
	}
	
	
	
}
