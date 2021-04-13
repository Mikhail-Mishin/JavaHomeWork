package JavaHomeWork;

import java.io.*;
import java.util.Scanner;

public class HWLesson6 {
//  3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



//1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
        file1();
        file2();

        String fileRead1 = "File1.txt";
        String fileRead2 = "File2.txt";



//        тренировочные методы, не относятся к ДЗ.
//        readFromFile(fileRead1);
//        readFromFile1(fileRead2);

//2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

        String fileRead3 = "File3.txt";

        unitedFiles(fileRead1, fileRead2, "File3.txt");
        readFromFile(fileRead3);


//    3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.

    System.out.println("Введите слово для поиска в файле 3:");

        try {
            System.out.println(searchWord(fileRead3));
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }


    }

//1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
    private static void file1() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("File1.txt");
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.print("Words words words words words words words !first file ends here > ");
            printStream.flush();
            printStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(" IOException");
        }
    }

    private static void file2() {
        try {
        FileOutputStream fileOutputStream1 = new FileOutputStream("File2.txt");
        PrintStream printStream1 = new PrintStream(fileOutputStream1);
        printStream1.print(" < second file starts from here! words words words words words words");
        printStream1.flush();
        printStream1.close();
        fileOutputStream1.close();

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(" IOException");
        }
    }

//******************************************************
//     тренировочные методы, не относятся к ДЗ.
    private static void readFromFile(String fileRead1){
        try {
            FileInputStream fileInputStream = new FileInputStream(fileRead1);

            int tmp;

            while ((tmp = fileInputStream.read()) != -1) {
                System.out.print((char) tmp);
            }
            fileInputStream.close();

            System.out.println((char) fileInputStream.read());
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(" File not found");
        } catch (IOException exception) {
            System.out.println(" IOException");
        }

    }

    private static void readFromFile1(String fileRead2){
        try {
            FileInputStream fileInputStream = new FileInputStream(fileRead2);

            int tmp;

            while ((tmp = fileInputStream.read()) != -1) {
                System.out.print((char) tmp);
            }
            fileInputStream.close();

            System.out.println((char) fileInputStream.read());
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(" File not found");
        } catch (IOException exception) {
            System.out.println(" IOException");
        }

    }

//*******************************************************

//2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

    private static void unitedFiles(String fileRead1, String fileRead2, String file3) {
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream("File3.txt");

            int tmp;
            FileInputStream fileInputStream3 = new FileInputStream(fileRead1);
            while ((tmp = fileInputStream3.read()) != -1)
                fileOutputStream2.write(tmp);
            fileInputStream3.close();

            FileInputStream fileInputStream4 = new FileInputStream(fileRead2);
            while ((tmp = fileInputStream4.read()) != -1)
                fileOutputStream2.write(tmp);
            fileInputStream4.close();

            fileOutputStream2.flush();
            fileOutputStream2.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(" File not found");
        } catch (IOException exception) {
            System.out.println(" IOException");
        }
    }

    private static void readFromFinalFile(String fileRead3){
        try {
            FileInputStream fileInputStream = new FileInputStream(fileRead3);

            int tmp;

            while ((tmp = fileInputStream.read()) != -1) {
                System.out.print((char) tmp);
            }
            fileInputStream.close();

            System.out.println((char) fileInputStream.read());
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(" File not found");
        } catch (IOException exception) {
            System.out.println(" IOException");
        }

    }

//3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.

    private static boolean searchWord(String fileRead3) throws IOException {

        String wordInput = scanner.nextLine();
        System.out.println("Есть ли слово " + wordInput + "?");

        FileInputStream fileInputStream6 = new FileInputStream(fileRead3);
        byte[] wordInputBytes = wordInput.getBytes();
        int tmp;
        int i = 0;
        while ((tmp = fileInputStream6.read()) != -1) {
            if (tmp == wordInputBytes[i]) {
                i++;
            } else {
                i = 0;
                if (tmp == wordInputBytes[i]){
                    i++;
                }
            }
            if (i == wordInputBytes.length){
                fileInputStream6.close();
                return true;
            }
        }
        fileInputStream6.close();
        return false;


    }






}
