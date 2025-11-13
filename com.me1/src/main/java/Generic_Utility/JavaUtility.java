package Generic_Utility;

import java.util.Random;

public class JavaUtility {
	public int randomNo() {
		Random ran = new Random();
		int Num = ran.nextInt(1000);
		return Num;
	}

}
