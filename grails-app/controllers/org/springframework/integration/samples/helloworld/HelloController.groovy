package org.springframework.integration.samples.helloworld

class HelloController {

    def helloWorldGateway
    def outputChannel
    def index() {
        helloWorldGateway.invokeHello(params)
        String result = outputChannel.receive(0).getPayload()
        render result
    }
}
