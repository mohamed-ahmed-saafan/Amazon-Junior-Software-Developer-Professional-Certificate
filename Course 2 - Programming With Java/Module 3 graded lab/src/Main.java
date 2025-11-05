public class Main {

    public static void main(String[] args) {

        // creating book files in myBooks directory


        String directoryPath = "./myBooks";
       String[] titles = {"The Great Gatsby", "1984", "To Kill a Mockingbird"};
        String[] authors = {"F. Scott Fitzgerald", "George Orwell", "Harper Lee"};

        for (int i = 0; i < titles.length; i++) {
            String fileName =  (titles[i]) + ".txt";
            String content = "Title: " + titles[i] + "\nAuthor: " + authors[i] + "\nSample Content...";
            FileCreator.createSampleFile(directoryPath, fileName, content);
        }


//      Task 1 testing


        String directoryPath1 = "./myBooks";
        DirectoryManager.listFilesAndDirectories(directoryPath1);


//       Task 2 testing
        String directoryPath2 = "./myBooksBackup";
        DirectoryManager.createDirectory(directoryPath2);


//     Task 3 testing

       String directoryPath3 = "./myBooksBackup";
       String newDirectoryPath = "./BooksBackupDirectory";
       DirectoryManager.renameDirectory(directoryPath3, newDirectoryPath);


//      Task 4 testing

      String srcPath = "./myBooks";
      String destPath = "./BooksBackupDirectory";
    DirectoryManager.copyFiles(srcPath, destPath);


//     Task 5 testing

      String filePath = "./myBooks/1984.txt";
      DirectoryManager.deleteFile(filePath);


//     Task 6 testing

      Book book = new Book("1984", "George Orwell", "978-0451524935");
      String filePath1 = "./myBooks/book.ser";
        Book.serializeBook(book, filePath1);
        Book deserializedBook = Book.deserializeBook(filePath1);
        System.out.println("Deserialized Book: " + deserializedBook);


    }

}
