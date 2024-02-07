package DataStructure.Array;

public class Q3_find_min_element {

        public static void main(String[] args) {
            int [] arr = {-1,0,60,99,90,50};
            int min=arr[0]; //max=40
            for(int j = 1; j < arr.length; j++) {
                if(  min > arr[j]){
                    System.out.println("max value:"+min);
                    System.out.println("arr[j]:"+arr[j]);
                    min=arr[j]; //out j value in max
                    System.out.println("so max is : "+ min);
                }
            }
            System.out.println("::::::final max value :"+ min+"::::::::::");
        }
    }


