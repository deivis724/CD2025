package com.davidel;
import java.util.regex.*;
public class ValidatorContraseña {

    public boolean esValida(String contraseña) {
        if (contraseña.length() < 8) {
            return false;
        }
        if (!Pattern.compile("[A-Z]").matcher(contraseña).find()) {
            return false;
        }
        if (!Pattern.compile("[a-z]").matcher(contraseña).find()) {
            return false;
        }
        if (!Pattern.compile("[0-9]").matcher(contraseña).find()) {
            return false;
        }
        if (!Pattern.compile("[!@#$%^&*]").matcher(contraseña).find()) {
            return false;
        }
        return true;
    }
}

