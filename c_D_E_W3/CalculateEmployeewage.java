package c_D_E_W3;

import java.util.Random;

public class CalculateEmployeewage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int empwageperhr = 20;
	        int emphrs = 0;
	        int empwage = 0;
	        Random ran= new Random();
	        int empcheck= ran.nextInt(2);
	       
	        if(empcheck == 1) {
	            emphrs = 8;
	            }
	        else {
	            emphrs = 0;
	            }
	        empwage = emphrs * empwageperhr;
	        System.out.println("Emp wage:" + empwage);
	}
}
	

