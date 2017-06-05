package grails.consul.health.indicator.example

class BootStrap {

    def grailsApplication

    def init = { servletContext ->

        println ''
        println 'From grails-app/init/grails/consul/health/indicator/example/BootStrap.groovy:'
        println "Value of bean consulHealthIndicator: $grailsApplication.mainContext.consulHealthIndicator"
        println ''

    }
    def destroy = {
    }
    
}
