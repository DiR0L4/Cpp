package task5;

public class Task {
    public static boolean check(String login, String password, String confirmPassword)
    {
        try {
            if(login.length() >= 20) throw new WrongLoginException("length >= 20");
            if(password.length() >= 20) throw new WrongPasswordException("length >= 20");
            if(!(password.equals(confirmPassword))) throw new WrongPasswordException("password != confirmPassword");

            char buff;
            for(int i = 0; i < login.length(); i++)
            {
                buff = login.charAt(i);
                if(!(Character.isLetterOrDigit(buff) || buff == '_'))
                {
                    throw new WrongLoginException("Login contains invalid characters");
                }
            }

            for(int i = 0; i < password.length(); i++)
            {
                buff = password.charAt(i);
                if(!(Character.isLetterOrDigit(buff) || buff == '_'))
                {
                    throw new WrongPasswordException("Password contains invalid characters");
                }
            }

        }
        catch (WrongLoginException | WrongPasswordException ex)
        {
            System.out.println(ex);
            return false;
        }
        System.out.println("Correct input");
        return true;
    }

    public static void main(String[] args) {

        Task.check("Stas", "123", "123");
        Task.check("St&as", "123", "123");
        Task.check("Stas", "123", "1234");
        Task.check("Stsdsdsdsdsdsdsdsdsdsdsdsdsdsdas", "123", "123");
    }

}
