package kz.alienware14.codewars.kyu7;

/** Descending Order

 *Your task is to make a function that can take any non-negative
 * integer as an argument and return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.

 * Examples:
 * Input: 42145 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321

 * Сіздің міндетіңіз - кез келген теріс емес бүтін санды аргумент ретінде
 * қабылдай алатын және оны цифрларымен кему ретімен қайтаратын функция жасау.
 * Негізінде, мүмкін болатын ең үлкен санды жасау үшін сандарды қайта реттеңіз.

 * Мысалдар:
 * Кіріс: 42145 Шығару: 54421
 * Кіріс: 145263 Шығыс: 654321
 * Кіріс: 123456789 Шығару: 987654321
 * **/

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
        System.out.println(sortDesc(15));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
    }
    public static int sortDesc(final int num){
        char[] numArr = Integer.toString(num).toCharArray();
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length-1; j++) {
                if(numArr[i] > numArr[j]){
                    char tmp = numArr[j];
                    numArr[j] = numArr[i];
                    numArr[i] = tmp;
                }
            }
        }
        return Integer.parseInt(new String(numArr));
    }
}
