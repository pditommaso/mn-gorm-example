package example.gorm.service

import example.gorm.domain.Person
import grails.gorm.services.Service
import groovy.transform.CompileStatic

@Service(Person)
@CompileStatic
interface PersonService {

    Person get(Serializable id)

    List<Person> list(Map args)

    Long count()

    Person save(Person person)
}
