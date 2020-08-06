public class LessonTwoHomeWork {

    String [][] arr = new String [4][4];
    int i = 0;
    int counter = 0;
    Integer k = new Integer(0);

    public void LessonTwoHomeWork(String[][] array) throws MyArraySizeException, MyArrayDataException {
       if (array.length == arr.length) {


           for (String[] m: array) {
               for (String l : m) {
                   k = Integer.parseInt(l);
                   if (k instanceof Integer) {
                       i += k;
                       counter++;
                   } else {
                       throw new MyArrayDataException("Неверный элемент массива" + "Ошибка в элементе № " + counter);
                   }
               }
           }
           System.out.println(i);
       } else {
           throw new MyArraySizeException("Неверный размер массива");
       }
    }
}
