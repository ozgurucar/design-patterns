package org.ozgurucar.prototype;

import java.util.Date;

public class App1 {
    public static void main(String[] args) {
        GeneralEntityService generalEntityService = new GeneralEntityService();

        Date dateBefore1 = new Date();
        Document document1 = generalEntityService.findDocument(1L);
        printDocumentAndTimeInterval(dateBefore1, document1);

       /* Date dateBefore2 = new Date();
        Document document2 = generalEntityService.findDocument(2L);
        printDocumentAndTimeInterval(dateBefore2, document2);*/


        //  Document3 is cloned from Document1 it is faster than creating from scratch.
        // After cloning we can set properties.
        Date dateBefore3 = new Date();
        Document document3 = null;
        try {
            document3 = document1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        document3.setName("Diary");
        document3.setData("My dear diary");
        document3.getDocumentType().setName("Personal 2");

        printDocumentAndTimeInterval(dateBefore3, document3);

        // If shallow copy is used, clones' references being attached and document type becoming Personal 2
        // But if deep copy is used, original document will not be changed.
        System.out.println(document1);

    }

    private static Long getSecondDifference(Date dateBefore, Date dateAfter) {
    return  Math.abs((dateBefore.getTime() - dateAfter.getTime()) / 1000);
    }

    private static void printDocumentAndTimeInterval(Date dateBefore, Document document) {
        Date dateAfter = new Date();
        Long secondDifference = getSecondDifference(dateBefore, dateAfter);

        System.out.println(document);
        System.out.println("Time interval: " + secondDifference);
        System.out.println();

    }
}
