package stringbufferandbuilder;

public class StringBufferBuilder {
	
   public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		for(int i=0; i<10000; i++) {
			sb.append("Tpoint");
			
			//System.out.println(sb);
		}
		
		System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("java");
		
		for(int i = 0; i<10000;i++) {
			sb2.append("Tpoint");
			//System.out.println(sb2);
		}
		
		System.out.println("Time Taken by StringBuilder:"+(System.currentTimeMillis()-startTime)+"ms");

	}

}
