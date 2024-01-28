package recursionprograms;

public class PrintingNumbers {
  public static void main(String[] args) {
	num(1);
}

private static void num(int no) {
	if(no<=10) {
		System.out.println(no);
		num(no+1);
	}
	
}
}
