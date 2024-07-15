package kz.alienware14.kyu8;

/** Thinkful - Logic Drills: Traffic light

 *DESCRIPTION:
 * You're writing code to control your town's traffic lights.
 * You need a function to handle each change from green, to yellow, to red,
 * and then to green again.

 * Complete the function that takes a string as an argument representing
 * the current state of the light and returns a string representing the state
 * the light should change to.

 * For example, when the input is green, output should be yellow.
 * **/

/**
 * Аудармасы:
 * Сіз өзіңіздің қалаңыздың бағдаршамдарын басқару үшін код жазып жатырсыз.
 * Жасылдан(green) сарыға(yellow), қызылға(red), содан кейін қайтадан жасылға(green) әр өзгертуді
 * өңдеу үшін функция қажет.

 * Жарықтың ағымдағы күйін көрсететін аргумент ретінде жолды алатын
 * және жарықтың өзгеруі керек күйді көрсететін жолды қайтаратын
 * функцияны аяқтаңыз.

 * Мысалы, кіріс жасыл болса, шығыс сары болуы керек
 * **/

public class TrafficLight {

    public static void main(String[] args) {
        System.out.println(updateLight("green"));
        System.out.println(updateLight("yellow"));
        System.out.println(updateLight("red"));
    }
    // Шешімі
    public static String updateLight(String current) {

        return current.equals("green")?"yellow":
                current.equals("yellow")? "red": "green";
    }
}
