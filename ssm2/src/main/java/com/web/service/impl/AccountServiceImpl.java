package com.web.service.impl;

import com.web.dao.AccountDao;
import com.web.entity.Account;
import com.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: YunYu
 * \* Date: 2022/3/24
 * \* Time: 16:47
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户。。。");
        accountDao.saveAccount(account);
    }
}
