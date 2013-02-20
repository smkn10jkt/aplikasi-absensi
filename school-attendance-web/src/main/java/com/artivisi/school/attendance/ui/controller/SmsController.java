/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.school.attendance.ui.controller;

import com.artivisi.school.attendance.domain.Sms;
import com.artivisi.school.attendance.service.BelajarRestfulService;
import com.sun.net.httpserver.HttpServer;
import java.net.URI;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriTemplate;

/**
 *
 * @author irfanmaulana
 */
@Controller
public class SmsController {
    
    @Autowired
    private BelajarRestfulService belajarRestfulService;
    
    @RequestMapping(value = "/notifications/sms", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody @Valid Sms sms, HttpServletRequest request, HttpServletResponse response){
        belajarRestfulService.save(sms);
        String requestUrl = request.getRequestURL().toString();
        URI uri = new UriTemplate("{requestUrl}/{id}").expand(requestUrl, sms.getId());
        response.setHeader("Location", uri.toASCIIString());
       
    }
    
    @RequestMapping(value="/notifications/sms/{id}", method= RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable String id, @RequestBody @Valid Sms sms){
        Sms smsDB = belajarRestfulService.findSmsById(id);
        if(smsDB !=null){
            belajarRestfulService.save(sms);
        }
    }
    
    @RequestMapping(value="/notifications/sms{id}", method= RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String id){
        Sms smsDB = belajarRestfulService.findSmsById(id);
        if(smsDB !=null){
            belajarRestfulService.delete(smsDB);
        }
    }
    
    @RequestMapping(value="/notifications/sms{id}", method= RequestMethod.GET)
    @ResponseBody
    public Sms findSmsById(@PathVariable String id){
        return belajarRestfulService.findSmsById(id);
    }
    
    @RequestMapping(value="/notifications/sms", method= RequestMethod.GET)
    @ResponseBody
    public Page<Sms> findSmss(Pageable pagination){
        return belajarRestfulService.findAllSmss(pagination);
    }    
}
