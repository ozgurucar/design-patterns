package org.ozgurucar.decorator;

public class StripedReportDecorator extends ReportDecorator{
    public StripedReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getText() {
        String text = super.getText();

        String stripedText;
        stripedText = ReportUtil.getStripedText(text);


        return stripedText;
    }
}
