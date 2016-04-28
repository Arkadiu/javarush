package com.javarush.test.level17.lesson10.home04;

/* Синхронизированные методы
Установить модификатор synchronized только тем методам, которым необходимо.
Объект класса Solution будет использоваться нитями.
*/

public class Solution {
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private void method0() {                                //потому он вызывает в себе method3(), который в свою очередь синхронизированный
        double i = method3();
    }

    protected synchronized void method1(String param1) {                //потому что он вызывает в себе метод, который не синхронизированный, чтоб не получилось так что double i = method3() будет иметь значение из другого потока, а не из вашего
        Solution solution = new Solution();
        solution.method0();
    }

    public void method2(int param1) {                   // потому что он не создает новых объектов и не изменяет общие ресурсы и не вызывает других методов
        param1++;
    }

    synchronized double method3() {                         //потому он доступается к общему private double param = Math.RANDOM(), который может использовать любой метод внутри класса Solution
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private synchronized void method4() {                   //потому что создается новый объект типа StringBuilder(), который не имеет встроенной синхронизации
        sb.append(1).append(1).append(1).append(1);
    }

    protected void method5(String param2) {                 //потому что создается новый объект типа StringBuffer(), который в себе имеет встроенную синхронизацию
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public synchronized String method6(int param2) {            //потому что он вызывает в себе метод, который не синхронизированный, и у него есть вывод в консоль
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    String method7(double param2) {             //потому что он не создает новых объектов и не изменяет общие ресурсы и не вызывает других методов
        return "" + param2;
    }

}
