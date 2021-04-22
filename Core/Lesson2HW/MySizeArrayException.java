package JavaHomeWork.Core.Lesson2HW;

public class MySizeArrayException extends ArrayIndexOutOfBoundsException {
    MySizeArrayException (String e){
        System.out.println("Поймано исключение " + e);
    }
}
