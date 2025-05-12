/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;
import java.util.Scanner;
import model.funciones;
/**
 *
 * @author sebastianordcha
 */
public class main {
    static Scanner sc = new Scanner(System.in);
    while{
            System.out.println("MENU");
            System.out.println("Selecciona una opcion: ");
            System.out.println("1. Crear carpeta");
            System.out.println("2. Crear archivo");
            System.out.println("3. Mostrar archivos");
            System.out.println("4. Mostrar archivo");
            System.out.println("5. Modificar archivo");
            System.out.println("6. Eliminar archivo");
            System.out.println("7. Contar caracteres");
            System.out.println("8. Contar palabras");
            System.out.println("9.Reemplazar palabras");
            System.out.println("10. Crear PDF");
            System.out.println("0. Salir");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    funciones.createFolder("HolaBB");
                    break;
                case 2:
                funciones.createFile(path, fileName, content);
                break;
                case 3:
                   funciones.showListFiles(path)
                break;
                case 4:
                    funciones.showFile(path, fileName)
                break;
                case 5:
                    funciones.overWriteFile(path, fileName, newContent)
                break;
                case 6:
                    funciones.deleteFile(path, fileName);
                break;
                case 7:
                    funciones.countChars(path, fileName)
                break;
                case 8:
                    funciones.countWords(path, fileName)
                break;
                case 9:
                    funciones.swapWords(path, fileName, oldWord, newWord)
                break;
                case 10:
                    
                break;
                case 0:
                    
                break; 
            }
}
}
