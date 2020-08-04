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

    @OneToOne(targetEntity = ModPreview.class, cascade = CascadeType.ALL)
    private ModPreview modPreview;

    @ManyToOne
    private Profile profile;
}
