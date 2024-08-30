/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem1;

/**
 *
 * @author USUARIO 2022
 */
public class Reordenar {

    // Método para reordenar las palabras en una oración
    public String reorder(String[] words) {
        // Crear un array del mismo tamaño para almacenar las palabras ordenadas
        String[] orderedWords = new String[words.length];

        // Recorrer cada palabra en el array de entrada
        for (String word : words) {
            // Extraer el último carácter que es el número de la posición
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            // Colocar la palabra en la posición correcta en el array ordenado (sin el número al final)
            orderedWords[index - 1] = word.substring(0, word.length() - 1);
        }

        // Unir las palabras en una sola cadena con espacios entre ellas
        return String.join(" ", orderedWords);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase
        Reordenar reorderSentence = new Reordenar();

        // Definir el arreglo de palabras
        String[] words = {"esta2", "bien4", "muy3", "esto1"};

        // Llamar al método para reordenar la oración
        String result = reorderSentence.reorder(words);

        // Imprimir el resultado
        System.out.println(result); 
        
    }
}

