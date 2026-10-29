package com.javaintroduction;

public class Variables {
	
	static int countryid;
	static String countryname;

	
	int jerseynum;
	String cricketername;
	
	public static void main(String[] args) {
		
		countryid=91;
		countryname="india";
		
		
		Variables rs=new Variables();
		
		rs.jerseynum=45;
		rs.cricketername="rohit";
		
		
		System.out.println("country id is:"+countryid);
		System.out.println("country name is:"+countryname);
		System.out.println(rs.jerseynum);
		System.out.println(rs.cricketername);

	}

}
