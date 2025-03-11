package com.davidel;

    public class EmailValidator {
        public boolean isValid(String email) {
            if (email == null) {
                return false;
            }
            return email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        }
    }
