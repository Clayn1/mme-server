package com.clayn.mmeserver.controller;


import com.clayn.mmeserver.dtos.ModPreviewDTO;
import com.clayn.mmeserver.model.ModPreview;
import com.clayn.mmeserver.service.IModPreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/previews")
public class ModPreviewController {

    @Autowired
    private IModPreviewService modPreviewService;

    @RequestMapping(method = RequestMethod.GET)
    public ModPreviewDTO getModPreviews(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size,
                                        @RequestParam(defaultValue = "numberOfDownloads") String orderBy,
                                        @RequestParam (defaultValue = "Desc") String direction,
                                        @RequestParam(defaultValue = "") String title){
        PageRequest pageRequest = PageRequest.of(page - 1, size,
                Sort.by(direction.equals("Desc") ? Sort.Direction.DESC : Sort.Direction.ASC, orderBy, "numberOfDownloads"));
        return modPreviewService.getModPreviews(pageRequest, title);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ModPreview createModPreview(@RequestBody ModPreview modPreview){
        return modPreviewService.insertModPreview(modPreview);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus
    public ModPreview updateModPreview(@RequestBody ModPreview modPreview, @PathVariable Integer id){
        modPreview.setId(id);
        return modPreviewService.updateModPreview(modPreview);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteModPreview(@PathVariable Integer id){
        modPreviewService.deleteModPreview(id);
    }
}
