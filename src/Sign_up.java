public class Sign_up extends User_operation {
    public boolean sign_up(String username, String password) {
        try {
            un.put(username, password);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
