package com.example.shaunmesias.assignment_6_2.domain.registration;

import java.io.Serializable;

/**
 * Created by Shaun Mesias on 2016/04/17.
 */
public class Register implements Serializable{
    private long id;
    private String username;
    private String password;
    private String email;


    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    private Register(Builder builder){
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
    }

    public static class Builder{
        private long id;
        private String username;
        private String password;
        private String email;

        public Builder id(long value){
            this.id = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Builder copy(Register register){
            this.id = register.id;
            this.username = register.username;
            this.password = register.password;
            this.email = register.email;
            return this;
        }

        public Register build(){
            return new Register(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Register)) return false;

        Register that = (Register) o;

        if (id != that.id) return false;
        if (username != null ? !username.equals(that.username) : that.username != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null)
            return false;
        return !(email != null ? !email.equals(that.email) : that.email != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
