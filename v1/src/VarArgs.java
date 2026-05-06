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
//    static void vaTest(String msg, int... v) {
//        System.out.print(msg + v.length + " Содержимое : ");
//        for (int x : v)
//            System.out.print(x + " ");
//        System.out.println();
//    }
//    public static void main(String[] args)
//    {

    /// / Обратите внимание , что теперь метод vaTest ()
    /// / можно вызывать с переменным числом аргументов.
//        vaTest (10 ) ; // 1 аргумент
//        vaTest (1, 2, 3 ) ; // 3 аргумента
//        vaTest (21); // без аргументов {
//    }
//        public static void main (String[]args){
//            System.out.println("Цикл for:");
//
//            // (инициализация; условие; шаг)
//            for (int i = 1; i <= 5; i++) {
//                System.out.println("Итерация №" + i);
//            }
//        }
//    }
    public class Main {
        public static void main(String[] args) {
            System.out.println("Цикл while:");

            int counter = 1;

            // Пока условие в скобках истинно
            while (counter <= 5) {
                System.out.println("Счетчик равен: " + counter);

                counter++; // Важно не забыть изменить условие, иначе цикл будет вечным
            }
        }
    }
}