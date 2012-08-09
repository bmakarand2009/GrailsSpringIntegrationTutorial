package org.springframework.integration.samples.helloworld;

import org.springframework.integration.annotation.Gateway;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: bmakarand
 * Date: 8/9/12
 * Time: 1:55 PM
 * To change this template use File | Settings | File Templates.
 */
public interface HelloWorldIf {
    @Gateway(requestChannel="inputChannel")
    public void invokeHello(Map emailParams) ;
}
