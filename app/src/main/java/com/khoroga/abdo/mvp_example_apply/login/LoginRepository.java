package com.khoroga.abdo.mvp_example_apply.login;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
