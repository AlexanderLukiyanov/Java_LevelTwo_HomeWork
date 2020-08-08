
public class LessonTwoHomeWork {
    public static final int ARRAY_SIZE = 4;

    public void getArrayElementsSum(String[][] array) throws MyArrayDataException, MyArraySizeException {

        if (array.length != ARRAY_SIZE) {
            throw new MyArraySizeException("Некорректный размер массива");
        }

        for (String [] arr : array) {
            if (arr.length != ARRAY_SIZE) {
                throw new MyArraySizeException("Некорректный размер массива");
            }
        }

        int summ = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    summ += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Преобразование элемента " + i + " " + j + " массива не удалось. Измените элемент "  + array[i][j]);

                }
            }
        }
        System.out.println("Сумма всех элементов = " + summ);
    }
}
