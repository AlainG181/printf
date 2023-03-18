public class printf{
    public static void main(String[] args) {
        //Variables
        String name = "Mindusting";
        byte age = 18;
        float height = 1.65f;

        System.out.printf("Hola, mi nombre es %s tengo %d años y mido %.1f.\n", name, age, height);
        
        /*
         * Como se puede ver en este "printf" dentro del texto ay ciertos 
         * caracteres especiales ("%s", "%d", "%.1f"), estos hacen referencia
         * a los valores que son indicados después del texto ("name", "age", "height"),
         * estos siguen el orden indicado, asociando "name" con "%s", esto es debido
         * a que es una variable de tipo "String", "age" con "%d" por que es un
         * digit, de ahí la "d" y por ultimo tenemos "height" con "%.1f", esto
         * indica que el valor es de tipo decimal debido a la "f" y que queremos
         * que los decimales sean redondeados al primer decimal debido al ".1".
         */

        float num1 = 1.65f;
        float num2 = 1.75f;
        
        System.out.printf("num1 = %.1f\n", num1);
        System.out.printf("num2 = %.1f\n", num2);

        /*
         * El num1 podrías pensar que como se está redondeando el decimal,
         * este va a dar "1.7" ya que como termina en "5" lo redondeará
         * hacia arriba, pues no, el resultado es "1.6".
         * 
         * Y luego llega el num2 que le pasa lo mismo que al "num1"
         * y pensaras (Ahora no me vas a pillar, el resultado va a ser
         * "1.7"), pues no, en este caso, si que lo redondea hacia arriba,
         * o por lo menos hasí a sido en mi caso, lo cual me deja bastante
         * desconcertado, no se por que ocurre, peor me e dado cuenta de
         * ello al estar haciendo pruebas...
         */
    }
}
