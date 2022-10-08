package basic;

public class test {
	public static void main(String[] args) {
		int count = 0;
			int [] a = {1, 3, 9,5,6};
			int [] b = {1, 4, 3, 7, 8};
			for (int i = 0; i<5; i++)
				if (!contains(a, b[i])) count++;
			
			System.out.println(count);
	}
	
	public static boolean contains(int[] array,int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }
}
