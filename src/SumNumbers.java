public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11bs33"));
    }
    public static int sumNumbers(String str) {
        int num= 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                int count = i;
                while(count < str.length() && Character.isDigit(str.charAt(count))){
                    count++;
                }
                num += Integer.parseInt(str.substring(i,count));
                i = count;
            }
        }
        return num;
    }
}
