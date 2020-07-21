package com.clayn.mmeserver.service;

import com.clayn.mmeserver.model.ModPage;
import com.clayn.mmeserver.model.ModPreview;

public interface IModPageService {
    ModPage insertModPage(ModPage movie);

    ModPage updateModPage(ModPage movie);

    void deleteModPage(Integer id);

    ModPage getModPage(Integer id);
}
