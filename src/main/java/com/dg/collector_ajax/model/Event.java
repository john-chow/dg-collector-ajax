package com.dg.collector_ajax.model;

import javax.validation.constraints.NotBlank;

public class Event {
    @NotBlank
    private String app;
    @NotBlank
    private String scene;
    private Integer timestamp;
    @NotBlank
    private String action;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
