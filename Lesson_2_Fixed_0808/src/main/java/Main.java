public class Main {
    public static void main(String[] args) {

        String[][] array = new String[4][4];

        array [0][0] = "1";
        array [0][1] = "2";
        array [0][2] = "3";
        array [0][3] = "4";
        array [1][0] = "5";
        array [1][1] = "6";
        array [1][2] = "7";
        array [1][3] = "8";
        array [2][0] = "9";
        array [2][1] = "10";
        array [2][2] = "11";
        array [2][3] = "12";
        array [3][0] = "13";
        array [3][1] = "14";
        array [3][2] = "15";
        array [3][3] = "16";

            LessonTwoHomeWork lessonTwoHomeWork = new LessonTwoHomeWork();
                try {
                    lessonTwoHomeWork.getArrayElementsSum(array);
                } catch (MyArraySizeException e) {
                    System.out.println(e.getMessage());
                } catch (MyArrayDataException e) {
                    System.out.println(e.getMessage());
                }
    }
}

