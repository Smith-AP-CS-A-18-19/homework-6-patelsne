public class Homework6 {

	private String word;
	private int numa;
	private int numb;
	private int numc;

	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	public Homework6(String s, int a, int b, int c) {
		word = s;
		numa = a;
		numb = b;
		numc = c;
		}

	/* Return true if the stored String comes before the provided
	 * String lexicographically, return false if it does not
	 */
	public boolean isBefore(String other) {
		if (word.compareToIgnoreCase(other) > 0) {
			return true;
		} else {
			return false;
		}
	}

	/* Return the maximum of the stored integers
	 */
	public int max() {
		if((numa > numb) && (numa > numc)) {
			return numa;
		} else if ((numb > numa) && (numb > numc)){
			return numb;
		} else if ((numc > numa) && (numc > numb)){
			return numc;
		} else {
			return -1;
		}

	}

	/* Return the middle value of the stored integers. If two numbers
	 * have the same value, return the lowest value. If all three numbers
	 * have the same value, return any. You must call the max() function
	 * to receive full credit
	 */
	public int mid() {
		if (max() == numa){
			if (numb >= numc){
				return numb;
			} else {
				return numc;
			}
		} else if (max() == numb){
				if (numa >= numc){
					return numa;
				} else {
					return numc;
				}
		} else if (max() == numc){
				if (numb >= numa){
					return numb;
				} else {
					return numa;
				}
		} else if ((max() == numa) && (max() == numb)){
			return numc;
		} else if ((max() == numc) && (max() == numb)){
			return numa;
		} else if ((max() == numa) && (max() == numc)){
			return numb;
		} else {
			return numa;
		}

	}

	/* Return true if the stored numbers were provided in ascending
	 * order. They are considered ascending if each number is greater
	 * than or equal to the previous. To get full credit, do not use
	 * >= or =<; instead use < or > and invert them with !
	 */
	public boolean isAscending() {
 		if (!((numc>numb) && (numb>numa))){
			return true;
		} else{
			return false;
		}
	}

	public static void main(String[] args) {
		int exitCode = 0;

		Homework6 hw6 = new Homework6("Drive", 4, 5, 6);

		if (hw6.isBefore("Cars")) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw6.max() == 6) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw6.mid() == 5) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		hw6 = new Homework6("Drive", 4, 5, 5);
		if (hw6.mid() == 4) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw6.isAscending()) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
