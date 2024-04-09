import java.util.*;

public abstract class User_operation {
    public static Map<String ,String> un = new HashMap();
    public boolean ifEmpty(){
        if(un.isEmpty()){
            return true;
        }
        return false;
    }
}

