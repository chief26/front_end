package com.example.shaunmesias.assignment_6_2.factories.register;

import com.example.shaunmesias.assignment_6_2.domain.registration.Register;

/**
 * Created by Shaun Mesias on 2016/05/07.
 */
public class RegisterFactory {
    public static Register getRegister(String username, String password, String email)
    {
        return new Register.Builder()
                .username(username)
                .password(password)
                .email(email)
                .build();
    }
}
