package com.metalcyborg.socialco.data.remote.bean.converter;

import com.metalcyborg.socialco.data.entity.Person;
import com.metalcyborg.socialco.data.remote.bean.PersonBean;

/**
 * Created by cyborg on 25.03.2018.
 */
public class PersonConverter {

    public static Person convert(PersonBean personBean) {
        Person person = new Person(
                personBean.getId(),
                personBean.getFirstName(),
                personBean.getLastName(),
                personBean.getEmail(),
                personBean.getAvatar()
        );

        return person;
    }
}
