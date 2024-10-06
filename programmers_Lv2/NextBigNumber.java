package programmers_Lv2;

public class NextBigNumber {
//	https://school.programmers.co.kr/learn/courses/30/lessons/12911
	public static void main(String[] args) {
		int n = 78;
//		int n = 8;
//	    String binary = Integer.toBinaryString(n);
//	    String s = "";
//	    int index = 0;
//	    int count = -1;
//	    StringBuilder sb = new StringBuilder();
//	    
//	    index = binary.lastIndexOf("01");
//	    
//	    if(index!=-1) {
//	    	sb.append(binary.substring(0, index)).append('1');
//	    	s = binary.substring(index+1);
//	    } else {
//	    	sb.append("10");
//	    	s = binary.substring(1);
//	    	count++;
//	    }
//	    
//	    for(int i=0; i<s.length(); i++) {
//	    	if(s.charAt(i)=='1') {
//	    		count++;
//	    	}
//	    }
//	    
//	    for(int i=0; i<s.length(); i++) {
//	    	if(s.length()-i!=count) {
//	    		sb.append('0');
//	    	} else {
//	    		sb.append('1');
//	    		count--;
//	    	}
//	    }
//	    
//	    System.out.println(Integer.parseInt(sb.toString(), 2));
	    
		int count = Integer.bitCount(n);
		
		for(n=n+1; count!=Integer.bitCount(n); n++);

	    System.out.println(n);
	    
//	    int postPattern = n & -n;
//	    int smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
//      System.out.println(n + postPattern | smallPattern);
	}

}
