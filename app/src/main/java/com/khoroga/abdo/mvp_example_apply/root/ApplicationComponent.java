package com.khoroga.abdo.mvp_example_apply.root;


import com.khoroga.abdo.mvp_example_apply.login.LoginActivity;
import com.khoroga.abdo.mvp_example_apply.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);

}
