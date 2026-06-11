public class reverseString {
    public static void main(String[] args){
        System.out.println("Hello World!");

        String original = "I Love Coding";
        String reversed = "";

        for (int i = 0; i < original.length(); i++){

            reversed = original.charAt(i) + reversed;
        }
        System.out.println(reversed);

    }
}
