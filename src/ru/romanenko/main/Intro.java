package ru.romanenko.main;

/**
 * Created by тс on 03.02.2016.
 */
//начинаем определять класс Intro:
public class Intro {
    //внутри класса Intro определяем метод main:
    public static void main(String[] args){
        System.out.println("Учимся кодить на Java");
    }
}
/**
 * Описание класса начинается с ключевого слова class. class Intro{...}, где:
 * Intro - название класса,
 * {...} - программный код класса.
 *
 * Метод main() - главный метод программы, это код, который выполняется в результате вызова программы.
 *
 * Ключевые слова public, static и void перед именем метода main() означают буквально следующее:
 * public — метод доступен вне класса,
 * static — метод статический и для его вызова нет необходимости создавать экземпляр класса (то есть объект),
 * void — метод не возвращает результат.
 *
 * Инструкция String[] args в круглых скобках после имени метода main() означает тип аргумента метода:
 * формальное название аргумента args, и этот аргумент является текстовым массивом (тип String).
 *
 * Команда заканчивается точкой с запятой.
 *
 * println() - встроенный метод для вывода в строку. Текст сообщения "" - это аргумент метода.
 */

 //Типы комментариев:
 // - однострочный комментарий
 /*
 многострочный комментарий */
/**
 * многострочный комментарий документационной информации
 */