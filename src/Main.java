public class Main {
    public static void main(String[] args) {
        // Tworzenie różnych kolorów
        Color color1 = new Color(255, 0, 0);           // Czerwony z domyślnym alpha
        Color color2 = new Color(0, 255, 0, 128);      // Zielony z alpha 128
        Color color3 = new Color(0, 0, 255, 255);      // Niebieski z pełnym alpha
        Color color4 = new Color(255, 255, 255);       // Biały z domyślnym alpha
        Color color5 = new Color(0, 0, 0, 0);          // Czarny z alpha 0

        // Wypisywanie wartości
        System.out.println("Color1: " + color1);
        System.out.println("Color2: " + color2);
        System.out.println("Color3: " + color3);
        System.out.println("Color4: " + color4);
        System.out.println("Color5: " + color5);
    }
}
