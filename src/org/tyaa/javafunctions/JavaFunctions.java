/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javafunctions;

/**
 *
 * @author student
 */
public class JavaFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Вызов функции
        //sayHello();
        // Вызов функции
        // hypothenuse();
        // System.out.println(hypothenuse());
        // System.out.println(hypothenuse(12.95, 50.0));
        // hypothenuseProcedure(12.95, 50.0);

        // System.gc();
        
        // System.out.println(myfun(0.5));
        System.out.println(fibonacci(6L));
    }

    // Описание функции
    /*private static void sayHello(){
        System.out.println("Hello");
    }*/
    // Описание функции
    private static Double hypothenuse(Double a, Double b) { // Заголовок функции
        // Тело функции
        // return 0d;
        // return a + b;
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    private static void hypothenuseProcedure(Double a, Double b) { // Заголовок функции
        // Тело функции
        System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    private static Double myfun(Double j) {
        return (Math.sin(Math.pow(j, 2)));
    }
    
    // При первом вызове функции
    //нужно передавать в нее номер элемента из ряда Фидоначчи
    // (https://www.mathsisfun.com/numbers/fibonacci-sequence.html)
    // В ходе работы функция вызывает свои копии каждый раз,
    // когда нужно вычислить два предыдущих значения,
    // суммой которых является текущее,
    // например: fibonacci(6L) будет: 3 + 5 = 8,
    // потому что в ряду 1 1 2 3 5 8
    // перед 8 стоят 3 и 5,
    // точно так же вычисляются элементы 3, 5 и все, которые перед ними,
    // до самого начала ряда
    private static Long fibonacci(Long n){
        if (n == 0L) {
            return 0L;
        }
        if (n == 1L || n == 2L) {
            return 1L;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}

