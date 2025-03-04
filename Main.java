package localFibonacciSequence;

public class Main {
	int[] value = new int{1,0,0};
	int n = 3;
	public static void main(String[] args) {
		for(int i = 0; i < n; i++) {
			value[2] = value[1]+value[0];
			System.out.println(value[2]);
		}
	}
}
