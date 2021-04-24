package JavaHomeWork.Core.Lesson2HW;

//Не сработало. Класс Main не обращает внимания на MyArrayDataException и MySizeArrayException,
// требуя только NumberFormatException и ArrayIndexOutOfBoundsException соответственно.
//

public class MyArrayDataException extends NumberFormatException{
    MyArrayDataException(String numberFormatException) {
        System.out.println("Поймано исключение " + numberFormatException);
    }

}
