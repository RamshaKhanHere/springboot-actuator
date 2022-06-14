package com.ramshakhanhere.springbootactuator.monitor;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
@Endpoint(id = "release-notes")
public class ReleaseNoteEndpoint {
    Map<String,String> releaseNotes = new LinkedHashMap<>();

    @PostConstruct
    public void initNotes(){
        releaseNotes.put("version 1", "Initial Version");
        releaseNotes.put("version 2", "Updated Version");
    }

    @ReadOperation
    public Map<String, String> getReleaseNotes(){
    return releaseNotes;
    }

}
