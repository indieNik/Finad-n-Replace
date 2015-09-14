package com.psl.assignment.string;

public class FindAndReplace {

	/**
	 * @param args
	 * 
	 */
	
	private String str, findStr, replaceStr;
	
	public FindAndReplace() {
		this.str = "My Name is Nik";
		this.findStr = "Nik";
		this.replaceStr = "Ritesh";
	}
	
	static String FindAndRep(FindAndReplace obj){
		
		String str1 = obj.str.replace(obj.findStr, obj.replaceStr);
		return str1;
	}
	
	public static void main(String[] args) {
	
		FindAndReplace obj = new FindAndReplace();
		System.out.println(FindAndRep(obj));

	}

}
