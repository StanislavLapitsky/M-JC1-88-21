package edu.academy.jc.bondarenko.cw10;
public class ClassWork {
    private String login;
    private String password;
    private String confirmPassword;
    public static void main(String[] args){
        ClassWork cw=new ClassWork();
        try {
            cw.setLogin("@!*-vladimir8");
            cw.setPassword("12345678");
            cw.setConfirmPassword("12345678");
            cw.validateReg(cw.getLogin(), cw.getPassword(), cw.getConfirmPassword());
        } catch (CatchNullPointer e) {
            System.out.println("CatchNullPointer");
        }
        catch (CatchLenghtEx e){
            System.out.println("Wrong length");
        }
        catch (CatchIllegalSymb e){
            System.out.println("Wrong symbol");
        }
        catch (CatchBoolean e){
            System.out.println("Wrong password");
        }
    }
    public void validateReg(String login, String password, String confirmPassword) throws CatchNullPointer, CatchLenghtEx, CatchIllegalSymb, CatchBoolean {
        if (login == null) {
            throw new CatchNullPointer(" Your login is empty");
        }
        else if(login.length()>21) {
            throw new CatchLenghtEx("The length of login is more than 20");
        }
        else if(!login.matches("[a-zA-Z0-9_]+"))
            throw new CatchIllegalSymb("Illegal symbol!");

        if (password == null) {
            throw new CatchNullPointer("Your password is empty");
        }
        else if(password.length()>21) {
            throw new CatchLenghtEx("The length of password is more than 20");
        }
        else if(!password.matches("[a-zA-Z0-1_]"))
            throw new CatchIllegalSymb("Illegal symbol!");

        if(confirmPassword==null) {
            throw new CatchNullPointer("Your confirmPassword is empty");
        }
        else if(confirmPassword.length()>21) {
            throw new CatchLenghtEx("The length of confirmPassword is more than 20");
        }
        else if(!confirmPassword.matches("[a-zA-Z0-1_]"))
            throw new CatchIllegalSymb("Illegal symbol");
        else if(!confirmPassword.equals(password)) {
            throw new CatchBoolean("confirm password is wrong");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
