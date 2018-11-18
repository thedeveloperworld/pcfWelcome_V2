package com.devworld.pcf;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PcfArchitectureDemo {


    @GetMapping(value="/welcome")
    public String welcome(){
        return "<br><center><h1 style=\"color:Green;\"><b>  Welcome  to PCF World :  </h1></b></br>" +
                "<br></br>"+
                "<center>This is second version</center>"+
                "<br></br>"+
                "<center> for <b>Blue - Green </b> deployment</center> ";
    }
}
