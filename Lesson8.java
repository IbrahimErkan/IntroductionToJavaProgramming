
package lesson8;

public class Lesson8 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        //Arrays
        
        //Collection of variables same types.
        
        int[] s = new int[10];
        //int[] arr = {5,6,4,21,3};
        
        int[] arr = {5,2,8,10,4,3,9,1,22,25};
        
        for (int i=0; i < arr.length; i++){
        System.out.println(arr[i]);
        }
        
        System.out.println("--------------------------");
        
        int[] q = {2,8,99,4,5,3,21,1,9,7};
        
        int min = q[0];
        
        for(int i = 1; i < q.length ; i++ ){
            if(q[i]<min){
                min = q[i];
            }
        }
        System.out.println("Minimum Element:" + min);
        
        
        //multidimensional arrays
        
        int[][] dizi = {{3,4,5},{0,1,2},{6,7,8},{9,10,11}};
        //System.out.println(dizi[1][2]);
        
        int total = 0;
        
        System.out.println(dizi.length);
        System.out.println(dizi[0].length);
        
        for (int x = 0; x < dizi.length; x++){
            for(int j= 0 ; j<dizi[x].length; j++){
                total += dizi[x][j];
            }
        }
        System.out.println("Total Result:" + total);
        
        
    }
    
}
