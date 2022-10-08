package basic;

public class ToHopKeTiep {
	static int a[] = new int [41], b[] = new int [41], n, k;
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		
		while(t-->0) {
			n = inScanner.nextInt(); k = inScanner.nextInt();
			for (int i=1; i<=k; i++)
				a[i] = inScanner.nextInt();
			next();
		}
	}
	public static void next (){
		b = a;
//		for (int c:b) System.out.print(c);
	    int i = k;
	    int count = 0;
	    while (i>=1 && a[i]==n-k+i) i--;
	    if (i>=1){
	        a[i]++;
	        if (a[i]<n-i+k)
	            for (int t=i+1; t<=k; t++)
	                a[t] = a[t-1]+1;
	        for (int t=1; t<=k; t++) 
	        	if (!contains(a,b[t])) {
	        		count++;
//	        		System.out.println("a="+a[t] +" "+ b[t]+ " "+count+" "+contains(a, b[t]));
	        	}
	    } else {
	        for (int t1=1; t1<=k; t1++)
	            a[t1]=t1;
	        for (int t11=1; t11<=k; t11++)
	        	if (!contains(a,b[t11])) {
	        		count++;
//	        		System.out.println("a="+a[t11] +" "+ b[t11]+ " "+count+" "+contains(a, b[t11]));
	        	}
	    }
//	    System.out.println();
	    System.out.println(count);
//	    for (int c:a) System.out.print(c);
	}
	
	public static boolean contains(int[] array,int v) {

        boolean result = false;

        for(int i = 1; i<=k; i++){
            if(array[i] == v){
                result = true;
                break;
            }
        }

        return result;
    }
}
