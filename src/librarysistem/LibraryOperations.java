/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysistem;
    public interface LibraryOperations {
    void addBook(Book book);
    void viewBooks();
    void borrowBook(int bookId, int userId);
    void returnBook(int bookId);
}

