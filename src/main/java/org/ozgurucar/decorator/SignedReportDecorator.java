package org.ozgurucar.decorator;

public class SignedReportDecorator extends ReportDecorator{
    public SignedReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getText() {

        String text = super.getText();
        String signedText;
        signedText = ReportUtil.getSignedText(text);
        return signedText;
    }
}
