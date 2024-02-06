/*
- Arrays are used to store multiple values in a single variable
- store similar data type
- fixed size
- mention size on start
- not dynamic array
*/
package DataStructure.Array;

public class Arrays {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr);// array = [ , int = [ , address = @58372a00
        System.out.println(arr[0]);//10
        System.out.println(arr[1]);//20
        System.out.println(arr[2]);//30
        System.out.println(arr[3]);//40
        System.out.println(arr[4]);//50

        System.out.println("::::::::used for loop:::::::");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(":::::::::print backward:::::::::");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println(":::::::::used enchance for loop::::::::::");
        //read only
        //forward only
        for (int value : arr) {
            System.out.println(value);//value can read element only
        }
        //example
        System.out.println("::::::::example: 1 ::::::");
        int[] arr1 = arr; //both point same address
        arr1[3] = 100;
        System.out.println(arr[3]);//100
        System.out.println(arr1[3]);//100



        int i = 0; //10 at index 0
        int j = 2; //30 at index 2

        System.out.println("::::::::case : 1:::::::");
        System.out.println("before swap func_"+arr[i] +" "+arr[j]);//10,30 element on i,j index
        swap(arr[i], arr[j]);// 30 ,10 element
        System.out.println("after swap func_"+arr[i] +" "+arr[j]);//10,30 not affect real value becasue it pointing only

        System.out.println(":::::::::case :2::::::::::::");
        System.out.println("before swap func_"+arr[i] +" "+arr[j]);//10,30 element on i,j index
        swapChange(arr ,i,j);// 30 ,10 arr  pass by refrence value
        System.out.println("after swap func_"+arr[i] +" "+arr[j]);//30,10  affect real value



    }
    public static void swap(int one , int two){
        int temp = one;//one vlaue goes to temp
        one = two;// two value goes to one
        two = temp;//temp value goes to two
        System.out.println("inside swap value_"+one+"_"+two);
    }

    public static void swapChange(int []a , int i , int j){
        int temp = a[i];//a[i] vlaue goes to temp
        a[i] = a[j];// a[j] value goes to one
        a[j] = temp;//temp value goes to a[j]
        System.out.println("inside swapChnge value_"+a[i ]+"_"+a[j]);

    }
}
