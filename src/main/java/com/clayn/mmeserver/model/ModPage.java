package com.clayn.mmeserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.awt.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ModPage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String fullDescription;
    private String customCss;
    @NotBlank
    @NotNull
    private String downloadPath;

    @OneToOne(targetEntity = ModPreview.class)
    private ModPreview modPreview;
}
// Короче Тайтл брать из Превью, также как и всякое другое, но связь двухсторонняя чтобы в Превью можно было взять Айди из Пейджа
