package newtest;

public class TwoDStringArray {

	public static void main(String[] args) {
	
		String a[][] = new String[2][2];
		
	    a[0][0]="This is LMN";
	    a[0][1]="This is XYZ";
	    a[1][0]="This is FGH";
	    a[1][1]="This is OPQ";
	    
	    for (int i=0;i<2;i++) {
	    	
	    	for (int j=0;j<2;j++) {
	    	System.out.println(a[i][j]);
	  
	    	}
	    }

	}

}
