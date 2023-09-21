
public class Bitwise {

	public static void main(String[] args) {
		int fs = 53; //00110101
		int gf = 186; //10111010
		
		System.out.println(Integer.toBinaryString(fs)); //start from 1
		System.out.println(Integer.toBinaryString(gf));
		System.out.println("-----------");
	
		System.out.println("Flag 1: " + (( (fs&1)>0) ? "On" : "Off"));
		System.out.println("Flag 2: " + (( (fs&2)>0) ? "On" : "Off"));
		System.out.println("Flag 3: " + (( (fs&4)>0) ? "On" : "Off"));
		System.out.println("Flag 4: " + (( (fs&8)>0) ? "On" : "Off"));
		System.out.println("Flag 5: " + (( (fs&16)>0) ? "On" : "Off"));
		System.out.println("Flag 6: " + (( (fs&32)>0) ? "On" : "Off"));
		System.out.println("Flag 7: " + (( (fs&64)>0) ? "On" : "Off"));
		System.out.println("Flag 8: " + (( (fs&128)>0) ? "On" : "Off"));
		System.out.println("-----------");
		
		int and = fs & gf;
		System.out.println(and);//1 if each bit have 1
		System.out.println(Integer.toBinaryString(and));
		int or = fs | gf;
		System.out.println(or);//1 if at least 1 bit have 1
		System.out.println(Integer.toBinaryString(or));
		int Exclusive_OR = fs ^ gf;
		System.out.println(Exclusive_OR);//1 if the bits are different
		System.out.println(Integer.toBinaryString(Exclusive_OR));
		int not = ~fs;
		System.out.println(not);//Changes the value of a bit to the opposite
		System.out.println(Integer.toBinaryString(not));
		int move_left = gf << fs;
		System.out.println(move_left);/*Shifts the bits of the 'gf' value
											on 'fs' positions to the left*/
		System.out.println(Integer.toBinaryString(move_left));
		int move_right = gf >> fs;
		System.out.println(move_right);/*Shifts the bits of the 'gf' value
											on 'fs' positions to the right*/
		System.out.println(Integer.toBinaryString(move_right));
		
		

	}

}
