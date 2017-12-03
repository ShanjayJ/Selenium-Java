package com.vmentry.oops;

public class StaticMemberAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMembers.pi = 3.14f;
		StaticMembers stat1, stat2;
		stat1 = new StaticMembers();
		stat2 = new StaticMembers();
		float area = StaticMembers.findArea(15.6f);
		stat1.displayArea(area);
		area = StaticMembers.findArea(4.9f);
		stat2.displayArea(area);

	}

}
