package homeworks.homework3;

public class Application {
    public static void main(String[] args) {
        char[][] arr = MultipleArrayBuilder.createArray(4, 4);

        MultipleArrayBuilder.printArray(arr);
        MultipleArrayBuilder.printEven(arr);
        MultipleArrayBuilder.printOdd(arr);
        MultipleArrayBuilder.pyramid(10);
    }
}