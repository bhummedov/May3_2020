package HackerRankQuestions;

public class WordMatch{
//    public static void main(String[] args) {
//        System.out.println(startWord("hippo","hi"));
//        System.out.println(startWord("hippo","xip"));
//        System.out.println(startWord("hippo","i"));
//    }
//    public static String startWord(String str, String word) {
//        if(str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1)))
//            return str.substring(0, word.length());
//        return "";
//    }
//}
public static void main(String[] args) {
    System.out.println(bringStart("hippo", "hi"));
    System.out.println(bringStart("hippo", "xip"));
    System.out.println(bringStart("hippo", "i"));
}
    public static String bringStart(String str,String word){
        String start = str.substring(1,word.length());
        String wordExceptFirst = word.substring(1,word.length());
        if(start.equals(wordExceptFirst)){
            return str.substring(0,word.length());
        }
        else {
            return "";
        }
    }
}