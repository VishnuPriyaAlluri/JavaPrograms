package conceptprograms;

public class StaticSingleCopy {
	//int count=0;
	static int count=0;
	public StaticSingleCopy() {
		count++;
		System.out.println(count);
	}
   public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
		new StaticSingleCopy();
	}
}
}
