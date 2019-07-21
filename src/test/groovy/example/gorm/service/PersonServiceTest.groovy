package example.gorm.service

import javax.inject.Inject

import example.gorm.Application
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@MicronautTest(application = Application)
class PersonServiceTest extends Specification{

    @Inject
    PersonService service

    def 'should list persons' () {
        expect:
        service.count() == 1
    }
}
