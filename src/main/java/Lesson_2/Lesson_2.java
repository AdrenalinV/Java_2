package Lesson_2;
/*
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
 * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и
 *  просуммировать. Если в каком-то элементе массива преобразование не удалось (например,
 *  в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
 *  MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения
 * MySizeArrayException и MyArrayDataException, и вывести результат расчета.
 */

public class Lesson_2 {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "b7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}//,"17"}
        };
        int result=0;
        try {
            result=demoException(array);
        }catch(MyArraySizeException | MyArrayDataException e){
            System.err.println(e);
            result=-1;
        }
        System.out.println("Сумма всех элементов массива = " + result);
    }


    public static int demoException(String[][] data) throws MyArraySizeException, MyArrayDataException {
        if (data.length != 4) {
            throw new MyArraySizeException("Ожидался массив String[4][4].");
        } else {
            for (String[] d : data) {
                if (d.length != 4) {
                    throw new MyArraySizeException("Ожидался массив String[4][4].");
                }
            }
        }
        int res = 0;
        int i = 0, j = 0;
        try {
            for (i = 0; i < data.length; i++) {
                for (j = 0; j < data[0].length; j++) {
                    res += Integer.parseInt(data[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(String.format("Ошибка в массиве данных [ %d ][ %d ]\n", i, j));
        }
        return res;
    }
}

