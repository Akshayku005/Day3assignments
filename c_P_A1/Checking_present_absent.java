package c_P_A1;

public class Checking_present_absent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double empCheck = Math.floor(Math.random() * 10) % 2;
       
        if (empCheck == 1)
             System.out.println("Employee is Present");
        else
             System.out.println("Employee is Absent");
	}


	}
