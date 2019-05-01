package day18_while_dowhileloop;

public class WhileLoop {
	public static void main(String[] args) {
		//create loop starting from 0 to 100
	    int n = 0;
	    int n1 = 100; 
	    while  (n1 >= n){
	      System.out.println(n);
	      n = n + 1; //or n++
	    }	    
	    //once loop is done, it exits bracket. 
	    System.out.println(n); //101
	}
}
	
