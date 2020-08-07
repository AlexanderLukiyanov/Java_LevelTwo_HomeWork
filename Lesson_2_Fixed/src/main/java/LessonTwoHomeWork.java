import java.util.Arrays;

public class LessonTwoHomeWork {

    String[][] arr = new String[4][4];
    int arraySumElement = 0;
    int counter = 0;
    Integer arrayTransElement = new Integer(0);

    public void LessonTwoHomeWork(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length == arr.length) {
            if (array[0].length == arr[0].length & array[1].length == arr[1].length & array[2].length == arr[2].length & array[3].length == arr[3].length) {

                for (String[] arrayLine : array) {
                    for (String arrayElement : arrayLine) {
                        if (arrayElement instanceof String) {
                            arrayTransElement = Integer.parseInt(arrayElement);
                            arraySumElement += arrayTransElement;
                            counter++;
                        } else {
                            throw new MyArrayDataException("Неверный элемент массива" + "Ошибка в элементе № " + counter);
                        }
                    }
                }
                System.out.println(arraySumElement);
            } else {
                throw new MyArraySizeException("Неверный размер массива");
            }
        } else {
            throw new MyArraySizeException("Неверный размер массива");
        }
    }
}
