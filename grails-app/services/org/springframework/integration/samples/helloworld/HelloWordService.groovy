package org.springframework.integration.samples.helloworld

class HelloWordService {


    def String sayHello(Map params) {
        return "HelloWorldService - $params"
    }
}
