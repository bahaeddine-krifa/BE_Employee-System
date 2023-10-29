package tech.getarrays.employeemanager.exception;

public class UserNotFoundEception extends RuntimeException {
    public UserNotFoundEception(String message) {
        super(message);
    }
}
