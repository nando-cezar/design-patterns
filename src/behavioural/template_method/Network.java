package behavioural.template_method;

public abstract class Network {

    String userName;
    String password;
    Network(){}

    public boolean post(String message){
        if(logIn(this.userName, this.password)){
            boolean result = false;
            if(isAuthorized())
                result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    /* hook */
    public boolean isAuthorized(){
        return true;
    }
    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
