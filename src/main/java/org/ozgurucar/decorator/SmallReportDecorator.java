package org.ozgurucar.decorator;

public class SmallReportDecorator extends ReportDecorator{
    private int width;

    public SmallReportDecorator(Report report) {
        super(report);
        this.width = 30;
    }

    @Override
    public String getText() {
    String text = super.getText();

    String fittedText;
        fittedText = ReportUtil.fitTheText(text, width);

        return fittedText;
    }
}
