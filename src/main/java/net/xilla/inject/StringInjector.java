package net.xilla.inject;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StringInjector {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("File name: ");
        String fileName = scanner.nextLine();

        System.out.println("Tag to replace: ");
        String tag = scanner.nextLine();

        System.out.println("What to replace it with: ");
        String replace = scanner.nextLine();

        File textFile = new File(fileName);
        try {
            String data = FileUtils.readFileToString(textFile);
            data = data.replace(tag, replace);
            FileUtils.writeStringToFile(textFile, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
