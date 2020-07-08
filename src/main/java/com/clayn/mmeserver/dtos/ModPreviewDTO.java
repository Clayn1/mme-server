package com.clayn.mmeserver.dtos;

import com.clayn.mmeserver.model.ModPreview;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ModPreviewDTO {
    private List<ModPreview> modPreviews;
    private int totalElements;
    private int pagesCount;
    private boolean isLast;
    private boolean isEmpty;
}
