package com.skycomm.mvpdemo.ui.login;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.skycomm.mvpdemo.R;
import com.skycomm.mvpdemo.app.AppComponent;
import com.skycomm.mvpdemo.base.BaseActivity;
import com.skycomm.mvpdemo.contract.LoginContract;
import com.skycomm.mvpdemo.ui.login.inject.DaggerLoginComponent;
import com.skycomm.mvpdemo.ui.login.inject.LoginModule;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by _H_JY on 2018/5/12.
 */

public class LoginActivity extends BaseActivity<LoginContract.Presenter> implements LoginContract.View {


    @BindView(R.id.et_account)
    EditText et_account;

    @BindView(R.id.et_password)
    EditText et_password;

    @BindView(R.id.btn_login)
    Button btn_login;

    @Override
    protected int initLayoutId() {
        return R.layout.activity_login;
    }


    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

        DaggerLoginComponent.builder()
                .appComponent(appComponent)
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);
    }


    @Override
    protected void initData() {

    }


    @OnClick(R.id.btn_login)
    public void onLogin(View v){

        String account = et_account.getText().toString().trim();
        String password = et_password.getText().toString().trim();

        presenter.login(account,password);

    }



    @Override
    public void loginSuccess(String result) {
        showToast("登录成功:"+result);
    }

    @Override
    public void loginFailure(String result) {
        showToast("登录失败:"+result);
    }
}
