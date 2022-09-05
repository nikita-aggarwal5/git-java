package jdk11features;

//public class LambdaDemo {
//    public static void main(String[] args){
//        String name= "Hello";
//        System.out.println(name.concat(" User"));
//    }
//}
interface con{
    public String say(String name);
}
public class LambdaDemo{
    public static void main(String[] args){
        String con =(s1,s2)->s1+s2;
        System.out.println(con("Hello","user"));


    }
}