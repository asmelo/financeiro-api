package com.asmelo.financeiroapi.resource;

import com.asmelo.financeiroapi.model.Entry;
import com.asmelo.financeiroapi.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntryResource {

    private EntryService entryService;

    @Autowired
    public EntryResource(EntryService entryService) {
        this.entryService = entryService;
    }

    @GetMapping("/entries")
    public List<Entry> getEntries() {
        return entryService.getEntries();
    }

}
