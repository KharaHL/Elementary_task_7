import java.util.ArrayList;
import java.util.Scanner;

 class Sequence {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public int inputMaxLength() {
        System.out.println("Input max length:");
        Scanner scanner = new Scanner(System.in);
        int maxLenth = scanner.nextInt();
        return maxLenth;
    }

    public int inputMinimalSquare() {
        System.out.println("Input minimal square");
        Scanner scanner = new Scanner(System.in);
        int minimalSquare = scanner.nextInt();
        int minimalNumber = (int) Math.sqrt(minimalSquare);
        return minimalNumber;
    }

    public ArrayList addArray() {
        int finishOfLine = inputMaxLength();
        int startOfLine = inputMinimalSquare();
        for (int i = startOfLine; i < (finishOfLine + startOfLine); i++) {
            if (startOfLine <= i) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public void outputArray() {
        ArrayList<Integer> outputArray = addArray();
        for (int i : outputArray) {
            System.out.print(i + ",");
        }
    }
}






