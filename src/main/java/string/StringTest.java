package string;

/**
 * https://blog.csdn.net/qq_34490018/article/details/82110578 讲解了string的坑，包括jdk6和jdk7以及以后对internal的实现不同
 */
public class StringTest {
    public static void main(String[] args) {
        // String s2= "1" + "3" + new String("1") + "4";
        // 等价于 String s2=new StringBuilder(“13”).append(new String(“1”)).append(“4”).toString();

//        System.gc();
//        String s1 = "1";
//        String s2 = "2";
//        String s12 = "12";
//        String str1 = new String("1");
//        String str2 = new String("hell");
//        String str12 = new String("12");
//
//
//        System.out.println(s12 == "1" + "2"); //true
//        System.out.println(s12 == s1 + s2); //false
//        System.out.println(s12 == str12.intern()); //true
//        System.out.println(str12.intern() == (str1 + str2).intern()); //true
//
//        String strAdd = str1 + str2;
//        System.out.println(strAdd == strAdd.intern()); //false
//
//        String s3 = new String("1") + new String("1");
//        System.out.println(s3 == s3.intern()); //true
        StringBuffer stringBuffer = new StringBuffer();
        String str = new String();
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());







    }
}
