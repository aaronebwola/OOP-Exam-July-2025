package com.mycompany.medicallogreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MedicalLogReader {
    public static void main(String[] args) {
        File medicalLogFile = new File("medical_log.txt");

        try {
            Scanner scanner = new Scanner(medicalLogFile);

            System.out.println("Medical Log File Contents:");
            System.out.println("==========================");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
            System.out.println("\nFile read successfully.");

        } catch (FileNotFoundException e) {
            System.err.println("Error: Medical log file not found!");
            System.err.println("Please ensure 'medical_log.txt' exists in the current directory.");
            System.err.println("Details: " + e.getMessage());

        } catch (IOException e) {
            System.err.println("Error reading medical log file!");
            System.err.println("An I/O error occurred while reading the file.");
            System.err.println("Details: " + e.getMessage());
        }
    }
}
