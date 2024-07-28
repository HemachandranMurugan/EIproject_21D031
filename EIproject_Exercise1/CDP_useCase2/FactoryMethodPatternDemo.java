package CDP_useCase2;

// Test
public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        DocumentCreator creator = new WordDocumentCreator();
        Document doc = creator.createDocument();
        doc.open();

        creator = new PdfDocumentCreator();
        doc = creator.createDocument();
        doc.open();
    }
}