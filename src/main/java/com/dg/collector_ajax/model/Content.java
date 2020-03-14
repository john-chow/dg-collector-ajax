package com.dg.collector_ajax.model;

import javax.validation.constraints.NotBlank;

public class Content {
    @NotBlank
    private String category;
    @NotBlank
    private String cid;
}
