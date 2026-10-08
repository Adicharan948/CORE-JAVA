//1. Create a Java class BugTracker to maintain bug details.
//Variables:
// > bugId, applicationName, bugTitle, severity,
//priority, status, assignedDeveloper
//Requirements:
// > Create an object in main() and initialize all values using the object reference.
// > Create getters for all variables.
//assignToDeveloper(int bugId, String developerName) → Assign developer and change status to "In Development".
// > updateStatus(String newStatus) → Update the bug status.
//displayBugSummary() → Display all bug details using getter methods.


package com.languagefundamentals.Methods;

public class BugTracker {
	
	int bugid;
	String applicationname;
	String bugtitle;
	String severity;
	String priority;
	String Status;
	String assignedDeveloper;
	
	
	int getbugid() {
		return bugid;
	}
	
	String getapplicationname() {
		return applicationname;
	}
	
	String getbugtitle() {
		return bugtitle;
	}
	
	String getseverity() {
		return severity;
	}
	
	String getpriority() {
		return  priority;
	}
	
	String getStatus() {
		return Status;
	}
	
	String getassignedDeveloper() {
		return assignedDeveloper;
	}
	
	public void assigntoDeveloper(int bugid,String developername) {
		this.bugid=bugid;
		this.assignedDeveloper=developername;
		this.Status="indevelopment";
		System.out.println(bugid+" "+developername);
		
		
	}
	
	void updatestatus(String newstatus) {
		this.Status=newstatus;
		System.out.println(newstatus);
	}
	
	void bigsummary() {
		System.out.println("bugid is:"+bugid);
		System.out.println("application name is:"+applicationname);
		System.out.println("bugtile is:"+bugtitle);
		System.out.println("serverity level is:"+severity);
		System.out.println("priority level is:"+priority);
		System.out.println("current status is:"+Status);
		System.out.println("assigned developer is:"+assignedDeveloper);
		
	}
	
	

	public static void main(String[] args) {
		
		BugTracker b=new BugTracker();
		b.bugid=1;
		b.applicationname="Stduentportal";
		b.bugtitle="nullpointerexception";
		b.severity="minor";
		b.priority="low";
		b.Status="open";
		b.assignedDeveloper="not assigned";
		
		b.bigsummary();
		
		b.assigntoDeveloper(1, "sai");
		b.updatestatus("Indevelopment");
		
		
		
		
		
		
		
		
	
	}
	
	
	
}
