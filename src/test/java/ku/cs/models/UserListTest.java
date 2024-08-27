package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList userList1;
    @BeforeEach
    void init(){
        userList1 = new UserList();
        userList1.addUser("bird", "111111");
        userList1.addUser("cat", "222222");
        userList1.addUser("dog", "333333");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them
        User user = userList1.findUserByUsername("dog");

        // TODO: assert that UserList found User
         String expected = "dog";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user


        boolean actual = userList1.changePassword("cat", "222222", "000000");

        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password
        User user = userList1.findUserByUsername("bird");
        User actual = userList1.login("bird", "111111");
        User expected = user;



        // TODO: assert that User object is found
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList1.login("bird", "000000");

        // TODO: assert that the method return null
         assertNull(actual);
    }

}