public class Var {
	public static void main(String[] args){
	String name1 = "Beauty";
	String name2 = "Pablo";
	String name3 = "Nike";
	String newName1 = name1;

	name1 = name2;
	name2 = name3;
	name3 = newName1;
	
	System.out.println(name1 + " " + name2 + " " + name3);
	}
}