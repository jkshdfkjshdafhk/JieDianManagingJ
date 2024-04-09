public class Login extends User_operation{
    public boolean logIn(String uname, String upassword){

        boolean bl = un.containsKey(uname);
        if(bl){
            String pass = un.get(uname);
            if(pass.equals(upassword)){
                return true;
            }
        }else {
            return false;
        }
        return false;
    }
}
