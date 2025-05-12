package model;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class funciones {

    // 1. Crear una carpeta
    public static void createFolder(String fileName) {
        File folder = new File(fileName);
        if (!folder.exists()) {
            folder.mkdirs();
        }
    }

    // 2. Crear un archivo (o añadir contenido si ya existe)
    public static void createFile(String path, String fileName, String content) throws IOException {
        File file = new File(path + "/" + fileName);
        FileWriter writer = new FileWriter(file, true);
        writer.write(content + System.lineSeparator());
        writer.close();
    }

    // 3. Mostrar lista de archivos
    public static String[] showListFiles(String path) {
        File folder = new File(path);
        return folder.list();
    }

    // 4. Mostrar contenido de un archivo
    public static String showFile(String path, String fileName) throws IOException {
        File file = new File(path + "/" + fileName);
        return new String(Files.readAllBytes(file.toPath()));
    }

    // 5. Sobrescribir archivo
    public static boolean overWriteFile(String path, String fileName, String newContent) throws IOException {
        File file = new File(path + "/" + fileName);
        if (!file.exists()) return false;
        FileWriter writer = new FileWriter(file);
        writer.write(newContent);
        writer.close();
        return true;
    }

    // 6. Borrar archivo
    public static void deleteFile(String path, String fileName) {
        File file = new File(path + "/" + fileName);
        file.delete();
    }

    // 7. Contar caracteres
    public static int countChars(String path, String fileName) throws IOException {
        return showFile(path, fileName).length();
    }

    // 8. Contar palabras
    public static int countWords(String path, String fileName) throws IOException {
        String content = showFile(path, fileName);
        return content.trim().split("\\s+").length;
    }

    // 9. Intercambiar palabras
    public static String swapWords(String path, String fileName, String oldWord, String newWord) throws IOException {
        String content = showFile(path, fileName);
        String newContent = content.replace(oldWord, newWord);
        overWriteFile(path, fileName, newContent);
        return newContent;
    }
}

