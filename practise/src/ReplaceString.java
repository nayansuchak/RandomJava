public class ReplaceString {
//    public static void main(String[] args) {
//        char[] str = "HL Besu   Blockchain   Hello".toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for (char c :
//                str) {
//            if (c != ' ') {
//                sb.append(c);
//            }
//        }
//        System.out.println("Output ------> " + sb);
//    }

    public static void main(String[] args) {
        String str = new String("HL Besu   Blockchain   Hello");
        str = str.replaceAll(" ", "");
        System.out.println("Output ------> " + str);
    }

}
