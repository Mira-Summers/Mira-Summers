package spring.config;

import org.springframework.context.annotation.Bean;
import spring.ioc.account.AccountService.AccountService;
import spring.ioc.account.AccountService.AccountServiceImpl;
import spring.ioc.account.dao.AccountDao;
import spring.ioc.account.dao.AccountDaoImpl;

public class SpringConfig03 {
    @Bean("accountService")
    public AccountService getAccountService(AccountService accountService){
        AccountService accountService1=new AccountServiceImpl();
        return accountService1;
    }


    @Bean("dao")
    public AccountDao getAccountDao(AccountDao accountDao){
        AccountDao accountDao1=new AccountDaoImpl();
        return accountDao1;
    }

}
