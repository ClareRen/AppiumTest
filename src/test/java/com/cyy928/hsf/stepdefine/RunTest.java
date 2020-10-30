package com.cyy928.hsf.stepdefine;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(
        features  = ("classpath:features"), //指定要执行的feature文件的路径
        dryRun = true , //检查所有步骤是否都有步骤(Step Definition)定义
        monochrome = true ,//控制台输出更具可读性
        glue = ("com.cyy928.hsf.stepdefine") //定义stepdefinition的代码文件的路径
)
public class RunTest {

}
