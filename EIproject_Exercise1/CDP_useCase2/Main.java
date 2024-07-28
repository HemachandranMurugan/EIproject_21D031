package CDP_useCase2;

// Product Interface
interface Document {
    void open();
}

// Concrete Product 1
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}

// Concrete Product 2
class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}

// Creator
abstract class DocumentCreator {
    public abstract Document createDocument();
}

// Concrete Creator 1
class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

// Concrete Creator 2
class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}


