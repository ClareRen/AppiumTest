Feature: 登录
"""
这是一个栗子
"""
  Scenario: 作为一个已注册的用户,输入正确的账号和密码能正常登录
    Given 存在用户账号为 13800138000 ，密码为 12345678
    When 用账号 13800138000 ，密码 12345678 登录
    Then 返回结果为 登录成功
    Given 存在用户账号为 \S* ，密码为 \S*


