package com.web.service;

import com.web.entity.Account;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: YunYu
 * \* Date: 2022/3/24
 * \* Time: 16:46
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface AccountService {

    //查询所有账户
    public List<Account> findAll();

    //保存账户
    public void saveAccount(Account account);

}
