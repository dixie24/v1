//public class VarArgs {
//    static void vaTest( int ... v) {
//    System.out.print("Koличecтвo аргументов : " + v.length + " Содержимое : ");
//    for (int x : v)
//        System.out.print(x + " ");
//    System.out.println();
//}
//    public static void main(String[] args)
//    {
//// Обратите внимание , что теперь метод vaTest ()
//// можно вызывать с переменным числом аргументов.
//        vaTest ( 1,0 ) ; // 1 аргумент
//        vaTest (1, 2, 3 ) ; // 3 аргумента
//        vaTest (); // без аргументов {
//}
//}

public class VarArgs {
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
// Обратите внимание , что теперь метод vaTest ()
// можно вызывать с переменным числом аргументов.
        vaTest (10 ) ; // 1 аргумент
        vaTest (1, 2, 3 ) ; // 3 аргумента
        vaTest (); // без аргументов {
    }
}