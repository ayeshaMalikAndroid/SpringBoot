package com.example.springBoot.controller;


import com.example.springBoot.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.JobHoldUntil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JournalEntity> journalEntities = new HashMap<>();

    @GetMapping
    private List<JournalEntity> getAll() {
        return new ArrayList<>(journalEntities.values());
    }

    @PostMapping
    public boolean createJournal(@RequestBody JournalEntity myEntity) {

        journalEntities.put(myEntity.getId(), myEntity);
        return true;
    }

    @GetMapping("id/{journalId}")
    public JournalEntity getJournalById(@PathVariable Long journalId) {
        return journalEntities.get(journalId);
    }
    @DeleteMapping ("id/{journalId}")
    public JournalEntity deleteJournalById(@PathVariable Long journalId) {
        return journalEntities.remove(journalId);
    }
    @PutMapping("id/{journalId}")
    public JournalEntity updateJournalById(@PathVariable Long journalId ,@RequestBody JournalEntity myEntity ){
        return journalEntities.put(journalId,myEntity);
    }
}
