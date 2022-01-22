package Array;

class JaggedArray2{

	  public static void main(String[] args) {
	    int[][] arr = {
	                     {10,9,8},
	                     {7,5,6,88},
	                     {30,15},
	                     {50},
	                     {10,20,30,40,50}
	                   };
	    System.out.println("Jagged array is (using for-each loop):");
	    for(int[] i: arr){
	      for(int j : i){
	        System.out.printf("%d\t",j);
	      }
	      System.out.println();
	    }
	    System.out.println("\nJagged array is (using for loop):");
	    for(int i=0; i < arr.length; i++){
	      for(int j=0; j < arr[i].length; j++){
	        System.out.printf("%d\t",arr[i][j]);
	      }
	      System.out.println();
	    }
	  }

	}