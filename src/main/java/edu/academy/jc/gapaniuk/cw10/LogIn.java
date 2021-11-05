package edu.academy.jc.gapaniuk.cw10;

public class LogIn {
    public static void main(String[] args) {
        LogIn oneOf = new LogIn();
        try {
            oneOf.validateRegistration("Set","111","121");
        } catch (EmptyLoginException e) {
            System.out.println(e);
        } catch (NotCorectNameException e) {
            System.out.println(e);
        } catch (TooLongNameException e) {
            System.out.println(e);
        } catch (WrongPasswordException e) {
            System.out.println(e);
        }

    }
    public void validateRegistration(String login,String password,String confirmPassword) throws EmptyLoginException, NotCorectNameException,TooLongNameException, WrongPasswordException {
        if (login.equals(null)|password.equals(null)|confirmPassword.equals(null)){
            throw new EmptyLoginException("EmptyLoginException");
        };
        if (login.equals("")|password.equals("")|confirmPassword.equals("")){
            throw new EmptyLoginException("EmptyLoginException");
        };
        if ((login.length()>20)|(password.length()>20)|(confirmPassword.length()>20)){
            throw new TooLongNameException("TooLongNameException");
        }
        if (!login.matches("[a-zA-Z0-1_]+")){
            throw new NotCorectNameException("NotCorectNameException");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("WrongPasswordException");
        }

    }
}
