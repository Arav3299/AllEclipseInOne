package com.prodian.task.exception.custom;

public class TestIt {
	
	private static void sendInvite(Student student) throws CriteriaMismatchException {
		
		if(student.getTotalCount()<1000) {
			throw new CriteriaMismatchException("Your total count is less than 1000 so you are not eligible to take test");
		}else if(student.getTotalRating()<10){
			throw new CriteriaMismatchException("Your total rating is less than 10 so you are not eligible to take test");
		}else {
			System.out.println("you are invited to take test");
		}
		
	}

	
	public static void main(String[] args) {
		
		Student student = new Student(11,1000,"arav");
		
		try {
			sendInvite(student);
		} catch (CriteriaMismatchException e) {
			 System.out.println(e.getMessage());
		}
		
	}

	
}
