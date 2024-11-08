package com.teachmeskills.hw.lesson_11.operations;

public class DocumentOperation {

    public static String extractingBlocks(String document) {
        String firstBlock = document.substring(0, 4);
        String secondBlock = document.substring(9, 13);

        return firstBlock + " " + secondBlock;
    }

    public static String outputStringForTask(String document) {

        return document.replaceAll("[A-Za-z]{3}", "***");

    }

    public static String outputLettersInFormatFirstCase(String document) {

        return "Letters: " + document.toLowerCase().substring(5, 8) + "/" + document.toLowerCase().substring(14, 17) + "/" + document.toLowerCase().charAt(19) + "/" + document.toLowerCase().charAt(21);

    }

    public static String outputLettersInFormatSecondCase(String document) {

        String[] arrayForTask = document.split("-");

        StringBuilder stringBuilder = new StringBuilder("Letters: ");

        stringBuilder.append(arrayForTask[1].toUpperCase()).append("/")
                .append(arrayForTask[3].toUpperCase()).append("/")
                .append(arrayForTask[4].toUpperCase().charAt(1)).append("/")
                .append(arrayForTask[4].toUpperCase().charAt(3));

        return stringBuilder.toString();
    }

    public static String contentCheck(String document) {

        if (document.toLowerCase().contains("abc")) {
            return "Document contains abc";
        } else {
            return "Document don't contains abc";
        }
    }

    public static String checkForBeginning(String document) {

        if (document.startsWith("555")) {
            return "Document start with 555.";
        } else {
            return "Document don't start with 555.";
        }
    }

    public static String checkForEnding(String document) {

        if (document.endsWith("1a2b")) {
            return "Document end with 1a2b";
        } else {
            return "Document don't end with 1a2b.";
        }
    }
}
