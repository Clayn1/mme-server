package com.clayn.mmeserver.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ModPreview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @Column(length = 30)
    private String title;
    @NotBlank
    private String description;
    private String imgPath;
    @PositiveOrZero
    private int numberOfDownloads;
    private int modPageId;

    @OneToOne(mappedBy = "modPreview")
    @JsonIgnore
    private ModPage modPage;

    @ManyToOne
    @JsonIgnore
    private Profile profile;

}
