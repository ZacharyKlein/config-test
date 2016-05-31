package config.test

import grails.core.GrailsApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value

class TestController {

    @Autowired
    GrailsApplication grailsApplication

    @Value('${test.value}')
    def testValue

    def index() {
        def otherTestValue = grailsApplication.config.getProperty('test.value', String)

        render "@Value: ${testValue}, getProperty: ${otherTestValue}"
    }
}
