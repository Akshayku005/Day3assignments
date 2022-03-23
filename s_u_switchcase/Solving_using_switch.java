package s_u_switchcase;

import java.util.Random;

public class Solving_using_switch {
	public static final int parttime = 1;
    public static final int fulltime = 2;
    public static final int empwageperhr = 20;
    public static void main(String[] args) {
        int emphrs = 0;
        int empwage = 0;
        Random ran= new Random();
        int empcheck= ran.nextInt(3);
        switch(empcheck) {
            case parttime:
            	emphrs = 4;
                System.out.println("For part time work total wage >>"); 
            	 System.out.println("employee hrs="+emphrs); 
                 empwage = emphrs * empwageperhr;
                 System.out.println("Emp wage=" + empwage);
                 break;
            case fulltime:
                emphrs = 8;
                System.out.println("For full time work total wage >>"); 
                System.out.println("employee hrs="+emphrs); 
                empwage = emphrs * empwageperhr;
                System.out.println("Emp wage=" + empwage);
                break;
        default:
                emphrs = 0;
                System.out.println("<<ABSENT >>"); 
                System.out.println("employee hrs="+emphrs); 
                empwage = emphrs * empwageperhr;
                System.out.println("Emp wage:" + empwage);
        }
}

}


