package c_t_wh6;

import java.util.Random;

public class C_totalworkinghours {

	 public static final int parttime = 1;
	    public static final int fulltime = 2;
	    public static final int empwageperhr = 100;
	    public static final int numofworkingdays = 20;
	    public static final int maxhrsinmonth= 100;
	    public static void main(String[] args) {
	        int emphrs = 0;
	        int totalemphrs = 0;
	        int totalworkingdays = 0;
	        while(totalemphrs < maxhrsinmonth && totalworkingdays < numofworkingdays) {
	            totalworkingdays++;
	            Random ran= new Random();
	            int empcheck= ran.nextInt(3);
	            switch(empcheck) {
	                case parttime:
	                    emphrs = 4;
	                    break;
	                case fulltime:
	                    emphrs = 8;
	                    break;
	                default:
	                    emphrs = 0;
	            }
	            totalemphrs+=emphrs;
	            System.out.println("Day:"+totalworkingdays+"emp hr:"+emphrs);
	        }
	        int totalempwage = totalemphrs * empwageperhr;
	        System.out.println("Total emp wage:" + totalempwage);
}

}
