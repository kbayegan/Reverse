
public class Reverse {

	public static void main(String argv []) {
		new Reverse();
	}
	
	public Reverse() {
		String response = MyIO.getString("Please enter a string: ");
		System.out.println(reverse(response));
	}
	
	private String reverse(String s) {
		String answer = "";
		for(int i=s.length()-1; i >=0; i--) {
			answer = answer + s.charAt(i);
		}
		return answer;
	}
}
