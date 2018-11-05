package server.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ServerController {
	
	@Value( "${test.prop}" )
	private String testProp;
	
	
    @RequestMapping("/health")
    public String health() {
        return "Success";
    }
    
    @RequestMapping("/prop")
    public String testProp() {
        return testProp;
    }

}
