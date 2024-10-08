// String store char of value
// String is not in java primitive type like int char
// All String are object of a pre define class of String
// in java Stirng are immutable (not change)
package DataStructure.Linear.String;

public class Strings {
    public static void main(String[] args) {
        //syntax
        //This creates a string using a string literal, which is stored in the string pool.
        //string itreal  this point to refrence if same value present not create value
        String str1 = "java";
        String strRef = "java";// here strRef didnot make any java value it refrence to str1 java value
        System.out.println(str1);

        //syntax
        //his creates a string object using the new keyword, stored in the heap memory.
        // here  new  make diff value in heap memory if another new made it also take  some  diff heap memory
        String str2 = new String("huz");
        System.out.println(str2);

        //String operation
        String sayName = "md huzaifa ansari";
        System.out.println("Name: " +sayName);
        System.out.println( sayName.length() ); // space also count :2+7+6 + 2 space =17

        //join 2 string using .concat
        String joinedString = str1.concat(str2);
        System.out.println(joinedString);//javahuz

        //compare two String using .equal
        boolean checkEqual = str1.equals(str2);
        System.out.println(checkEqual); //false

        // == vs .equal
        String name1 = new String("huzaifa");
        String name2 = new String("huzaifa");
        boolean result1 = name1 == name2; //  this match the refrence
        System.out.println( "== :"+result1); //false
        boolean result2 = name1.equals(name2); // this match inside content
        System.out.println(".equal :"+result2); // true

        // this is "very" important
        String format = "this is \"very\" important"; // to write " very"
        System.out.println(format);

        // immutable example
        String example1 = "hello";// this have his own memory and place
        example1 = example1.concat("world");// here this hello world have in diffrent memeory seprately
        System.out.println(example1);

        //charat(index) to break string
        String newStr = "huzz";
        char newStrRes0 = newStr.charAt(0);
        char newStrRes1 = newStr.charAt(1);
        char newStrRes2 = newStr.charAt(2);
        char newStrRes3 = newStr.charAt(3);
        System.out.println(newStrRes0);
        System.out.println(newStrRes1);
        System.out.println(newStrRes2);
        System.out.println(newStrRes3);
        //to find length of string without knowing the string
        System.out.println(newStr.length()-1);

        //substring take range (to , from)
        System.out.println("substring");
        System.out.println(newStr.substring(0,2));

    }
}
