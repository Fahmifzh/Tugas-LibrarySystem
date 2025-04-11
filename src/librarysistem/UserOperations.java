/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysistem;

/**
 *
 * @author Fahmi Fauziah
 */
public interface UserOperations {
   void addUser(User user);
   void viewUser();
   void updateUser(int id, User updateUser);
   void deleteUser(int id);
}
