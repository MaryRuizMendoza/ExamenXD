
public class ArraysElementosMedios {
	public static void main(String[] args) {
		arreglos arr = new arreglos();
		int arreglo[] = arr.arrFinal();
		
		   for (int i = 0; i < arreglo.length; i++) {
		         System.out.println("Array[" + i + "] = " + arreglo[i]);
		      }
		
	}
	
	 public static class arreglos {
		 
		 int[] j = new int[] {1,2,3};
			int val1 =  j[2];
			int[] k = new int[] {7,7,7};
			int val2 = k[2];
			
	      public int[] arrFinal() {
	         int array[] = {val1,val2};
	         return array;
	      }
	   }

}
