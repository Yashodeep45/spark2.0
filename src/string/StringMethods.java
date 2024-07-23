public class Methods {
    public static void main(String[] args) {
        String str1="JAVA";
        String str2=str1.toLowerCase();
        System.out.println(str2);
        System.out.println("------------------");
        String str3="    yash   ";
        String str4=str3.trim();
        System.out.println(str4);
        System.out.println("--------------------");
        String str5="yashodeep";
        String str6=str5.substring(2);
        System.out.println(str6);
        System.out.println("----------------------");
        String str7="patilyashodeep";
        String str8=str7.substring(5,14);
        System.out.println(str8);
        System.out.println(str7.indexOf("a",4));
        String str9="python";
        String str10="python";
        System.out.println(str9.equals(str10));
        System.out.println("------------------------");
        String str11="a";
        System.out.println(str11.matches("[abc]"));
        String str12="a";
        System.out.println(str12.matches("\\w"));
    }
}
