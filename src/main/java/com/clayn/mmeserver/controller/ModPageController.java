package com.clayn.mmeserver.controller;

import com.clayn.mmeserver.model.ModPage;
import com.clayn.mmeserver.service.IModPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/mods")
public class ModPageController {

    @Autowired
    private IModPageService modPageService;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ModPage getModPage(@PathVariable Integer id){
        return modPageService.getModPage(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ModPage createModPage(@RequestBody ModPage modPage){
        return modPageService.insertModPage(modPage);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus
    public ModPage updateModPage(@RequestBody ModPage modPage, @PathVariable Integer id){
        modPage.setId(id);
        return modPageService.updateModPage(modPage);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteModPage(@PathVariable Integer id){
        modPageService.deleteModPage(id);
    }
}
