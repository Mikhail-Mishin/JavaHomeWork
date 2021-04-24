package JavaHomeWork.Core.Lesson2HW;

public class Main {

    public static void main(String[] args){

//1. Написать метод, на вход которому подается двумерный строковый массив размером 4х4.


        String[][] array = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12"},
                {"13","14","15","16"},
        };
        printMethod(array);
        System.out.println("__________________________________________________________");

//3. В методе main() вызвать полученный метод, обработать возможные исключения
// MySizeArrayException и MyArrayDataException и вывести результат расчета.

        try {
            sizeExceptionMethod(array);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Поймано исключение " + e);
        }
        System.out.println("__________________________________________________________");
        sumMethod(array);
        System.out.println("__________________________________________________________");
        try {
            array[2][3]  = "r";
            sumMethod(array);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Поймано исключение " + numberFormatException);

        }
    }

    public static void printMethod(String[][] array) {
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[y].length; x++){
                System.out.print(array[y][x] + "\t");
            }
            System.out.println();
        }
    }

    // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
   public static void sizeExceptionMethod(String[][] array) throws ArrayIndexOutOfBoundsException {
            System.out.println(array[5][5]);
    }

//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе преобразование не удалось (например, если в ячейке лежит символ или текст вместо числа),
// надо бросить исключение MyArrayDataException с детализацией, в какой ячейке неверные данные.
    public static void sumMethod(String[][] array) throws NumberFormatException {
            int sum = 0;
            for (int y = 0; y < array.length; y++) {
                for (int x = 0; x < array[y].length; x++){
                    sum += Integer.parseInt(array[y][x]);
                }
            }
            System.out.println("Сумма элементов массива = " + sum);

        }




}
