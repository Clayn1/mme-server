package com.clayn.mmeserver.service;

import com.clayn.mmeserver.dtos.ModPreviewDTO;
import com.clayn.mmeserver.model.ModPreview;
import org.springframework.data.domain.PageRequest;

public interface IModPreviewService {
    ModPreview insertModPreview(ModPreview movie);

    ModPreview updateModPreview(ModPreview movie);

    void deleteModPreview(Integer id);

    ModPreviewDTO getModPreviews(PageRequest pageRequest);

}
