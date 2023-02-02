import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    public static void main(String[] args) {
       /* User testuser = new User("mike", "password", "mike", "smith", "07904589184");
        System.out.println(testuser);*/

        //automated testing
        //1- setup object and test data

        String testUsername = "mike";
        String testPassword = "password";
        String testFirstName = "Mike";
        String testLastName = "Smith";
        String testMobileNumber = "07904589184";

        //create user
        User testUser = new User(testUsername, testPassword, testFirstName, testLastName, testMobileNumber);

        //3 - verify assert

        Boolean passed = true;

        //tc1
        if(testUser.getUsername() != testUsername){
            System.out.println("TC1 Not Passed - usernames do not match");
            passed = false;
        }

        //tc2
        if(testUser.getPassword() != testPassword){
            System.out.println("TC2 Not Passed - passwords do not match");
            passed = false;
        }

        //tc3
        if(testUser.getFirstName() != testFirstName){
            System.out.println("TC3 Not Passed - first names do not match");
            passed = false;
        }

        //tc4
        if(testUser.getLastName() != testLastName){
            System.out.println("TC4 Not Passed - last names do not match");
            passed = false;
        }

        //tc5
        if(testUser.getMobileNumber() != testMobileNumber){
            System.out.println("TC5 Not Passed - mobile numbers do not match");
            passed = false;
        }

        if(passed){
            System.out.println("All TCs passed!!!!");
        }


    }

}