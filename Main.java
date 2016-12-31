import java.util.ArrayList; //

public class Main {
    static final byte FO = 51; // створюємо константу "FO = Fifty One".
    static int G[] = {51,102,153,204,255}; // створюєм масив "G" щоб брати random значення.
    static int R = 51, B = 255; // створюєм значення "R", "B".
    static  ArrayList<String> RGB = new ArrayList<String>(); // Створюєм список "RGB".

    public static void main (String[]args) {
        int nambersG = G.length; // Вираховуєм кількість елементів.
        System.out.println("\tRGB");
            while (R <= 255 && B >= FO) {
                int randG = (int) (Math.random() * nambersG); // Генеруєм випадковий елемент з масиву "G".
                RGB.add(R + "-" + G[randG] + "-" + B); // добавляєм 3 об'єкти "R","G","B" в єдиний список.
                if (R == 255) {
                    B -= FO;
                    R = FO;
                            } else R += FO;
                }
                 for (int i = 0; i<9;i++){
                     System.out.println(i+1+")"+RGB.get(i)); // Звертаємось і виводимо списки.
                 }
        }
    }