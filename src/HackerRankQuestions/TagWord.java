package HackerRankQuestions;

public class TagWord {
    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));
    }
    public static String makeTags(String tag, String word) {
        return ("<"+tag+">"+word+"</"+tag+">");
    }
}
