package OOP_HomeProject_07_03;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"adg", "rty", "dft", "fghj"};
        StringBuilder sb = new StringBuilder();

        for (String str: arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
        sb.delete(0, sb.length());
        sortArray(arr);
        for (String str: arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);

        Class<?> c = String.class; //вход в рефлексию
    }

    private static <Type extends Comparable<Type>> void sortArray(Type[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    Type temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
