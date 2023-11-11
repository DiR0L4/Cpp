public class Bebra {
    public static void task(String str)
    {
        System.out.println("Last: " + str.charAt(str.length() - 1));

        if(str.endsWith("!!!")) System.out.println("Ends with !!!");
        else System.out.println("Not ends with !!!");

        if(str.startsWith("I like")) System.out.println("Starts with I like");
        else System.out.println("Not starts with I like");

        if(str.contains("Java")) System.out.println("Contains Java");
        else System.out.println("Not contains Java");

        int buff = str.indexOf("Java");
        if (buff != -1) System.out.println("Index of Java: " + buff);
        else System.out.println("Not found");

        System.out.println(str.replaceAll("a", "o"));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        str.substring(buff, buff + 4);
        System.out.println(str.substring(0, buff) + str.substring(buff + 4, str.length()));
    }



}
