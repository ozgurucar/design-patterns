package org.ozgurucar.prototype;

public class GeneralEntityService {
    public DocumentType findDocumentType(Long id) {
        try {

        Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DocumentType documentType = new DocumentType();
        documentType.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Personal";
        } else if (id.compareTo(2L) == 0){
            name = "Company";
        } else {
            name = "General";
        }
        documentType.setName(name);
        return documentType;
    }

    public Category findCategory(Long id) {
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Category category = new Category();
        category.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Private";
        } else if (id.compareTo(2L) == 0){
            name = "Work";
        } else {
            name = "General";
        }
        category.setName(name);
        return category;
    }

    public Document findDocument(Long id) {
        try {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentType(id));
        document.setCategory(findCategory(id));

        String name;
        String data;
        if (id.compareTo(1L) == 0) {
            name = "Letter";
            data = "Sincerely dear friend ...";
        } else if (id.compareTo(2L) == 0){
            name = "Report";
            data = "Report to supervisor";
        } else {
            name = "Traffic rules";
            data = "Wait on red lights";
        }
        document.setName(name);
        document.setData(data);
        return document;
    }
}
