package com.teachmeskills.hw.lesson_11;

import com.teachmeskills.hw.lesson_11.operations.DocumentOperation;

/**
 * Write a program with the following functionality:
 * Pass a string as input (we will assume that this is a standard document number in a given format).
 * The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is any digit, and y is a letter of the Latin alphabet (can be upper or lower case).
 * - Display the first two blocks of 4 digits on one line.
 * - Display the document number, but replace the blocks of three letters with *** (each letter will be replaced with *).
 * - Display only the letters from the document number in the format yyy/yyy/y/y in lower case.
 * - Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in upper case (implemented using the StringBuilder class).
 * - Check whether the document number contains the sequence "abc" and display a message whether it does or not (moreover, abc and ABC are considered the same sequence).
 * - Check if the document number starts with the sequence 555.
 * - Check if the document number ends with the sequence 1a2b.
 * All these methods are implemented in a separate class in static methods, each task - in a separate method.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        String document = "3425-Agf-7482-Hbs-4i7H";

        //- Display the first two blocks of 4 digits on one line.
        System.out.println(DocumentOperation.extractingBlocks(document));

        // - Display the document number, but replace the blocks of three letters with *** (each letter will be replaced with *).
        System.out.println(DocumentOperation.outputStringForTask(document));

        // - Display only the letters from the document number in the format yyy/yyy/y/y in lower case.
        System.out.println(DocumentOperation.outputLettersInFormatFirstCase(document));

        // - Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in upper case (implemented using the StringBuilder class).
        System.out.println(DocumentOperation.outputLettersInFormatSecondCase(document));

        // - Check whether the document number contains the sequence "abc" and display a message whether it does or not (moreover, abc and ABC are considered the same sequence).
        System.out.println(DocumentOperation.contentCheck(document));

        // - Check if the document number starts with the sequence 555.
        System.out.println(DocumentOperation.checkForBeginning(document));

        // - Check if the document number ends with the sequence 1a2b.
        System.out.println(DocumentOperation.checkForEnding(document));
    }
}
