package day10;

public class accountmain {

	public static void main(String[] args) {
		account accobj=new account();
		accobj.setAcc_num(1234);
		accobj.setName("aisha");
		accobj.setAmount(1000);
		System.out.println(accobj.getAcc_num());
		System.out.println(accobj.getName());
	}
	

}
