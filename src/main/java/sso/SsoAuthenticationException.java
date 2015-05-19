package sso;

public class SsoAuthenticationException extends Exception {

    public SsoAuthenticationException() { super(); }
    public SsoAuthenticationException(String message) { super(message); }
    public SsoAuthenticationException(String message, Throwable cause) { super(message, cause); }
    public SsoAuthenticationException(Throwable cause) { super(cause); }

}
