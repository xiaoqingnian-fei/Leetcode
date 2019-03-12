import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
    	int key=0;
    	int p=x;
    	boolean key1=true;
    	while(x!=0) {
    		if(x<0)
    		{
    			key1=false;
    			break;
    		}
    		else {
    			int y=x%10;
    			x=x/10;
    			key=key*10+y;   			
    		}
    		
    	}
    	if(p==key) {
			key1=true;
		}
		else {
			key1=false;
		}
    	return key1;
    }
}
public class Main {

	public static void main(String[] args) {
    Solution a=new Solution();
		int x=in.nextInt();
		System.out.println(a.isPalindrome(x));
	}
}
