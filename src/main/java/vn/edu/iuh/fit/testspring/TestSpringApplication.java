package vn.edu.iuh.fit.testspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import vn.edu.iuh.fit.testspring.models.Account;
import vn.edu.iuh.fit.testspring.repositories.AccountRepository;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class TestSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringApplication.class, args);
    }

    @Autowired
    private AccountRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Random rnd = new Random();
//        for(long i = 0; i < 100; i++) {
//            Account account = new Account(i, "Name #" + i, rnd.nextDouble(1000));
//            repository.save(account);
//        }
//        repository.findAll().forEach(System.out::println);


        PageRequest request =  PageRequest.of(1, 5);
//        Page<Account> content = repository.findAll(request);
//        List<Account> accounts = content.getContent();
//        accounts.forEach(System.out::println);

        repository.findByBalanceGreaterThan(500, request).forEach(System.out::println);
    }
}
