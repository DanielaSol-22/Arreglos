/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem2;

/**
 *
 * @author USUARIO 2022
 */
import java.util.Arrays;

public class Fusionar {

    // Método para fusionar y ordenar dos arreglos de enteros
    public int[] mergeAndSort(int[] nums1, int[] nums2) {
        // Crear un nuevo arreglo con el tamaño de ambos arreglos combinados
        int[] mergedArray = new int[nums1.length + nums2.length];

        // Copiar los elementos de nums1 y nums2 al nuevo arreglo
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        // Ordenar el arreglo resultante
        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase
        Fusionar fusionar = new Fusionar();

        // Definir los arreglos de ejemplo
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        // Llamar al método para fusionar y ordenar los arreglos
        int[] result = fusionar.mergeAndSort(nums1, nums2);

        // Imprimir el resultado
        System.out.println(Arrays.toString(result)); 
    }
}
