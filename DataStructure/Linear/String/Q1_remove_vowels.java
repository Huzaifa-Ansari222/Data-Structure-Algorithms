package DataStructure.Linear.String;

public class Q1_remove_vowels {
    public static void main(String[] args) {
        String greeting = "hiwellcomeback";//14
        removeVowels(greeting);
    }
    static void removeVowels(String greeting){
        for (int i = 0; i < greeting.length(); i++) {
            char check =  greeting.charAt(i); // 0=h ; 1=i; 2=w....so on
            if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u'){ //if this false then print / if true we skiip and iterate loop
                continue; //back to line 9 for loop
            }
            System.out.print(" "+check);
        }
    }
}
//note if continue hit it return to the loop and continue the iteratiion and skiping the rest bottom code