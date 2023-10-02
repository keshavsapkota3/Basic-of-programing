package houseofjava;

public class mwthod1 {
	public static String printHelloHAMK(int i) {
		String[] hello= new String[4];
		hello[0]="hello kxa";
		hello[1]="timro";
		hello[2]="hi";
		hello[3]="hihi";
		
		return hello[i];
	}
	public static void main(String[] args) {
		System.out.println(printHelloHAMK(2));
		
	}

}
