package org.ozgurucar.decorator;

public class App {
    public static void main(String[] args) {
        /*
         * With Decorator Pattern we can implement each kind of reports into different types
         * This method provides us productivity and compatability.
         * For example; we can transform normal report to striped, fitted or any combination.
         * */

        String content = getReportContent();

        //String text = normalReportOutput(content);

        NormalReport normalReport = new NormalReport(content);

        StripedReportDecorator decorator1 = new StripedReportDecorator(normalReport);
        SmallReportDecorator decorator2 = new SmallReportDecorator(decorator1);
        SignedReportDecorator decorator = new SignedReportDecorator(normalReport);

        String text = decorator.getText();
        System.out.println(text);

    }

    private static String normalReportOutput(String content) {
        NormalReport normalReport = new NormalReport(content);

        String text = normalReport.getText();
        return text;
    }

    private static String getReportContent() {
        String content = "What is Lorem Ipsum?\n" +
                "\nLorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "\nLorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "\nwhen an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "\nIt has survived not only five centuries, but also the leap into electronic typesetting, remaining " +
                "\nessentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing " +
                "\nLorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including " +
                "\nversions of Lorem Ipsum.";
        return content;
    }
}
