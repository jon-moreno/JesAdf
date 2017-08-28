public class DUMMYLoginService 
{
    private String username;
    private String password;
    private boolean authenticated;

    public DUMMYLoginService() {
    }

    /**
     * @param username
     * @param password
     */
    public void login(String username, String password)
    {
        this.authenticated = false;
        
        if( (username.equals("admin")) && (password.equals("pass")) ){
            this.authenticated = true; 
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean getAuthenticated() {
        return authenticated;
    }
}
