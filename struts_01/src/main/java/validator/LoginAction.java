package validator;

import com.opensymphony.xwork2.ActionSupport;

import java.util.regex.Pattern;

public class LoginAction extends ActionSupport {
    String username;
    String password;
    String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void validateUserLogin() {
        if(username==null || "".equals(username.trim())){
            this.addFieldError("username","用户名不能为空");
        }
        if(password==null || "".equals(password.trim())){
            this.addFieldError("password","密码不能为空");
        }
        if(password.length()<6 || password.length()>10){
            this.addFieldError("password","为了您账号的安全，请设置6个字母以上的密码（最长可设置10个字母）");
        }
        if(email==null || "".equals(email.trim())){
            this.addFieldError("email","邮箱账号不能为空");
        }
        else if(!Pattern.matches("^[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+",email)){
            this.addFieldError("email","邮箱账号格式错误");
        }
        if(!username.equals(password)){
            this.addFieldError("password","账号名或密码错误");
        }
    }

    public String userLogin(){
        return "successUser";
    }

    public String adminLogin(){
        return "successAdmin";
    }
}
