package HackerRankQuestions;

public class WordSeperator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("word","X", 3));
        System.out.println(repeatSeparator("This","And", 2));
        System.out.println(repeatSeparator("This","And", 1));
    }
    public static String repeatSeparator(String word, String sep, int counter) {
        String result="";
        for(int i=0;i<counter;i++){
            result+=word+sep;
        }
        return result.substring(0,result.length()-sep.length());
    }
}
