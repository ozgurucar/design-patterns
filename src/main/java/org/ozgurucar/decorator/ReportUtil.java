package org.ozgurucar.decorator;

import java.util.ArrayList;
import java.util.List;

public class ReportUtil {

    public static String getStripedText(String text) {
        StringBuilder stripedText = new StringBuilder();
        String[] lines = text.split("\n");

        for (String line : lines) {
            String stripedLine = addStripeForEachLine(line);
            stripedText.append(stripedLine);
        }

        return stripedText.toString();
    }

    private static String addStripeForEachLine(String line) {
        if (line.trim().isEmpty()) {
            return "\n";
        } else {
            return "- " + line + "\n";
        }
    }

    public static String fitTheText(String text, int width) {
        StringBuilder fittedText = new StringBuilder();
        String[] lineList = text.split("\n");

        for (String eachLine : lineList) {
            if (eachLine.length() <= width) {
                fittedText.append(addAndNewLine(eachLine));
            } else {
                List<String> splittedText = splitText(eachLine, width);

                for (String eachNewLine : splittedText) {
                    fittedText.append(addAndNewLine(eachNewLine));
                }
            }
        }

        return fittedText.toString();
    }

    private static String addAndNewLine(String addedText) {
        return addedText + "\n";
    }

    private static List<String> splitText(String eachLine, int width) {
        List<String> splittedLineList = new ArrayList<>();

        for (int i = 0; i <= eachLine.length() / width; i++) {
            int first = width * i;
            int last = first + width;

            if (last > eachLine.length()) {
                last = eachLine.length();
            }

            String splittedLine = eachLine.substring(first, last);

            if (splittedLine.trim().length() > 0) {
                splittedLineList.add(splittedLine);
            }
        }

        return splittedLineList;
    }

    public static String getSignedText(String originalText) {
        return addSign(originalText);
    }

    private static String addSign(String originalText) {
        String sign = "\n \n \t \t \t \t \t \t Sign: ";
        return originalText + sign;
    }
}
