import java.util.Scanner;

class Solution {
    public int reverse(int x) {
    	int key=0;
    	while(x!=0) {
    		int y=0;
    		y=x%10;
    		x=x/10;
    		if (key > Integer.MAX_VALUE/10 || (key == Integer.MAX_VALUE / 10 && y > 7)) return 0;
            if (key < Integer.MIN_VALUE/10 || (key == Integer.MIN_VALUE / 10 && y < -8)) return 0;
            key=key*10+y;
    	}
    	return key;
    }
}
//Integer.MAX_VALUE/10  32位整数最大范围为Integer.MAX_VALUE，但是针对于该算法中的key，key=key*10，所有要/10即可.
public class Main {

	public static void main(String[] args) {
        Solution x=new Solution();
		int a=in.nextInt();
		System.out.println(x.reverse(a));
		System.out.println(Integer.MAX_VALUE/10);
	}
}
