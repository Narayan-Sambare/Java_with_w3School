import java.io.*; // Needed for IOException (checked exception)


/*
 * Main Class
 * WHY?
 * - Entry point of application
 */
public class ExceptionMiniProject {

    public static void main(String[] args) {

        BankController controller = new BankController();

        // Try different values to test all cases
        controller.process(5000, 6000); // insufficient balance
        // controller.process(5000, 2000); // DB failure
        // controller.process(5000, -10);  // invalid amount

        System.out.println("Program continues normally...");
    }
}

/*
 * Custom Checked Exception
 * WHY?
 * - Business rule error (not system error)
 * - Forces caller to handle it
 */

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String msg) {
        super(msg); // pass message to parent Exception class
    }
}

/*
 * DAO Layer (Low-level operations like DB / File)
 * WHY throws?
 * - DAO should NOT decide how to handle errors
 * - It only informs the caller that a problem may occur
 */
class BankDAO {

    void updateBalance() throws IOException {

        // Simulating DB / file failure
        // Checked exception → must be declared using throws
        throw new IOException("Database connection failed");
    }
}

/*
 * Service Layer (Business Logic)
 * WHY?
 * - Validate rules
 * - Convert technical exceptions into meaningful business/system exceptions
 */
class BankService {

    /*
     * throws InsufficientBalanceException
     * WHY?
     * - This is a business rule violation
     * - Caller (Controller) should decide how to respond
     */
    void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        // Unchecked exception
        // WHY?
        // - Programming mistake / invalid input
        if (amount <= 0) {
            throw new ArithmeticException("Invalid withdrawal amount");
        }

        // Checked custom exception
        // WHY?
        // - Business rule (insufficient balance)
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        try {
            // Calling low-level DAO method
            new BankDAO().updateBalance();

        } catch (IOException e) {

            // WHY wrap IOException into RuntimeException?
            // - Service layer hides technical details
            // - Converts it into system-level failure
            throw new RuntimeException("Transaction failed", e);
        }
    }
}

/*
 * Controller Layer (Top-level handling)
 * WHY?
 * - Final decision point
 * - Shows message / response to user
 * - Prevents program crash
 */
class BankController {

    void process(int balance, int amount) {

        try {
            // Calling service layer
            new BankService().withdraw(balance, amount);

            System.out.println("Withdrawal successful");

        }
        // Handling business exception
        catch (InsufficientBalanceException e) {
            System.out.println("Business Error: " + e.getMessage());
        }
        // Handling system / runtime exception
        catch (RuntimeException e) {
            System.out.println("System Error: " + e.getMessage());
        }
        finally {
            // WHY finally?
            // - Executes always
            // - Used for cleanup / logging
            System.out.println("Transaction completed (finally block)");
        }
    }
}
