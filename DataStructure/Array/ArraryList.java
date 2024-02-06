//create resizeable  array size
// dynamic array
//size not fixed

package DataStructure.Array;
import  java.util.ArrayList ;


public class ArraryList {
    public static void main(String[] args) {

        //ArrayList<type> name = new ArrayList<type>()
        ArrayList<Integer> age = new ArrayList<Integer>();

        ArrayList<String> language = new ArrayList<String>();

        //add element
        language.add("java");
        language.add("javaScript");
        language.add("python");
        language.add("c");
        //print language of all
        System.out.println(language);//[java, javaScript, python, c]

        //acess element by indexing using get
        System.out.println(language.get(1));

        //Update/change
        //set(index , element)
        language.set(2,"html/css");
        System.out.println(language);//[java, javaScript, html/css, c]

        //Remove
        //remove(index)
        language.remove(3);
        System.out.println(language);//[java, javaScript, html/css]

        //iteration using for each
        for(String lang : language){
            System.out.println(lang);
        }



    }
}
