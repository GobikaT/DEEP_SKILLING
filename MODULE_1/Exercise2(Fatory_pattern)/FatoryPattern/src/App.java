public class App {
    public static void main(String[] args) throws Exception {
       DocumentFactory word=new WordDocumentFactory();
       Document worddoc=word.createDocument();
       worddoc.open();
       DocumentFactory pdf=new PdfDocumentFactory();
       Document pdfdoc=pdf.createDocument();
       pdfdoc.open();
       DocumentFactory excel=new ExcelDocumentFactory();
       Document exceldoc=excel.createDocument();
       exceldoc.open();
      }
}
