package com.cyy928.hsf.stepdefine;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest
public class  StepDefs{

    String LoginResult=null;
    @Given("^存在用户账号为 (\\S*) ，密码为 (\\S*)$")
    public void hasUser(String userName,String phone){

        //DataFactory df=new DataFactory();
        System.out.println("Create User!");
    }

    @When("^用账号  (\\S*) ，密码 (\\S*) 登录$")
    public void login(String phone, String password) throws Throwable {
        System.out.println("Login!");
    }

    @Then("返回结果为 (\\S*)")
    public void checkResult(String expect) throws Throwable{

        System.out.println("check result!!");
    }

}

