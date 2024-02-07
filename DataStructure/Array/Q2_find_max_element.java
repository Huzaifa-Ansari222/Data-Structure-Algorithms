package DataStructure.Array;

public class Q2_find_max_element {
    public static void main(String[] args) {
        int [] arr = {40,60,99,90,50};
        int max=arr[0]; //max=40
        for(int j = 1; j < arr.length; j++) {
            if(  max < arr[j]){
                System.out.println("max value:"+max);
                System.out.println("arr[j]:"+arr[j]);
                max=arr[j]; //out j value in max
                System.out.println("so max is :"+ max);
            }
        }
        System.out.println("::::::final max value :"+ max+"::::::::::");
    }
}
