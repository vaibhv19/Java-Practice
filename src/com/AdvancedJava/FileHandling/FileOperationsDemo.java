package com.AdvancedJava.FileHandling;

import java.io.File;
import java.io.IOException;

/**
 * FileOperationsDemo demonstrates java.io.File utility operations:
 * - File creation, deletion, existence check
 * - Metadata retrieval (name, path, size, permissions)
 * - Directory creation and listing contents
 */
public class FileOperationsDemo {

    public static void main(String[] args) {
        File file = new File("sample_test_file.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getName());
            }

            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Writeable:  " + file.canWrite());
            System.out.println("Is Readable:   " + file.canRead());
            System.out.println("File Size:     " + file.length() + " bytes");

            // Clean up created file
            if (file.delete()) {
                System.out.println("Cleaned up sample file.");
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
