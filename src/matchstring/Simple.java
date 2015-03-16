package matchstring;

/**
 * 朴素的模式匹配
 * 
 * @author uncle
 * 
 */
public class Simple {
	public static void main(String[] args) {

	}

	/**
	 * 
	 * @param son
	 * @param father
	 * @return
	 */
	public int findIndex(String son, String father) {

		int index = -1;
		char[] sonChars = son.toCharArray();
		char[] fatherChars = son.toCharArray();

		if (sonChars.length > fatherChars.length) {
			return index;
		}
		int soni = 1;
		int fatheri = 1;

		for (int i = 0; i <= fatherChars.length - sonChars.length; i++) {
			
		}

		return index;
	}
}
