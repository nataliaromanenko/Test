package ru.romanenko.main;

/**
 * Created by тс on 04.02.2016.
 */
public class VarDemo {
    public static void main(String[] args){
// Инициализация переменных:
        byte age=34;  // 8 бит, целые числа в диапазоне от –128 до 127, класс Byte
        char sex='м'; // 16 бит, символьный тип для представления символьных значений (букв). Диапазон значений от 0 до 65536, класс Character
        double weight=103.6; // 64 бита, действительные числа двойной точности, класс Double.
        int height=182; // 32 бита, целые числа в диапазоне от –2147483648 до 2147483647, класс Integer
        int eight = 012; // восьмеричный литерал
        int sixteen = 0x12; // шестнадцатеричный литерал
// Вывод данных:
        System.out.println("Персональные данные пользователя:");
        System.out.println("Возраст: "+age+" лет");
        System.out.println("Пол (м/ж): "+sex+".");
        System.out.println("Вес: "+weight+" кг");
        System.out.println("Рост: "+height+" см");
        System.out.println(eight);
        System.out.println(sixteen);
    }
}

