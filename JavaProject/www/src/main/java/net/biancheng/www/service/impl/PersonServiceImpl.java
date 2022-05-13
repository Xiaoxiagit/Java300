package net.biancheng.www.service.impl;

import net.biancheng.www.bean.Person;
import net.biancheng.www.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private Person person;
    @Override
    public Person getPersonInfo(){
        return person;
    }
}
