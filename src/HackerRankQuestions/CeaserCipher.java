package HackerRankQuestions;

public class CeaserCipher{
    public static void main(String[] args) {
        doThatWayCeasarCipher("abcdxyz");
    }
    public static void doCeasarCipher(String word){
        char ch;
        for (int i = 0; i < word.length() ; i++) {
            ch = word.charAt(i);
            ch = (char) ((ch - 'a' + 3)%26 + 'a');
            System.out.print(ch);
        }
    }
    public static void  doThatWayCeasarCipher(String word){
        String original = "abcdefghijklmnopqrstuvwxyz";
        String ciphered = "defghijklmnopqrstuvwxyzabc";
        int index=0;
        for (int i = 0 ; i < word.length() ; i++ ){
            index = original.indexOf(word.charAt(i));
            System.out.print(ciphered.charAt(index));
        }
    }
}
