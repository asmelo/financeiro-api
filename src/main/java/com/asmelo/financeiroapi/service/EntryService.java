package com.asmelo.financeiroapi.service;

import com.asmelo.financeiroapi.model.Entry;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Service
public class EntryService {
//teste commit
    public List<Entry> getEntries() {
        Entry entry1 = new Entry(Instant.now(), new BigDecimal(10), "Abacate4");
        Entry entry2 = new Entry(Instant.now(), new BigDecimal(20), "Leite");
        Entry entry3 = new Entry(Instant.now(), new BigDecimal(30), "Café");

        List<Entry> entries = List.of(entry1, entry2, entry3);

        return entries;
    }

}
