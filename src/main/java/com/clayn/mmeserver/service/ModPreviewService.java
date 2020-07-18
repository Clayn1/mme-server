package com.clayn.mmeserver.service;

import com.clayn.mmeserver.dtos.ModPreviewDTO;
import com.clayn.mmeserver.model.ModPreview;
import com.clayn.mmeserver.model.User;
import com.clayn.mmeserver.repository.ModPreviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ModPreviewService implements IModPreviewService {

    @Autowired
    private ModPreviewRepository modPreviewRepository;

    @Override
    public ModPreview insertModPreview(ModPreview modPreview) {
        return modPreviewRepository.save(modPreview);
    }

    @Override
    public ModPreview updateModPreview(ModPreview modPreview) {
        return modPreviewRepository.save(modPreview);
    }

    @Override
    public void deleteModPreview(Integer id) {
        modPreviewRepository.deleteById(id);
    }

    @Override
    public ModPreviewDTO getModPreviews(PageRequest pageRequest, String search) {
        Page<ModPreview> modPreviewPages = modPreviewRepository.findModPreviewsByTitleContaining(search, pageRequest);

        ModPreviewDTO modPreviewDTO = new ModPreviewDTO();
        modPreviewDTO.setModPreviews(modPreviewPages.getContent());
        modPreviewDTO.setEmpty(modPreviewPages.isEmpty());
        modPreviewDTO.setLast(modPreviewPages.isLast());
        modPreviewDTO.setPagesCount(modPreviewPages.getTotalPages());
        modPreviewDTO.setTotalElements(modPreviewPages.getNumberOfElements());
        return modPreviewDTO;
    }
}
