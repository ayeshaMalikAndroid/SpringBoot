package com.example.springBoot.controller;

import com.example.springBoot.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
    private Map<Long, JournalEntity> journalEntities = new HashMap<>();

    @GetMapping
    private List<JournalEntity> getAll() {
        return null;
    }

    @PostMapping
    public boolean createJournal(@RequestBody JournalEntity myEntity) {

        return true;
    }

    @GetMapping("id/{journalId}")
    public JournalEntity getJournalById(@PathVariable Long journalId) {
       return null;
    }
    @DeleteMapping ("id/{journalId}")
    public JournalEntity deleteJournalById(@PathVariable Long journalId) {
      return null;
    }
    @PutMapping("id/{journalId}")
    public JournalEntity updateJournalById(@PathVariable Long journalId ,@RequestBody JournalEntity myEntity ){
        return null;
    }
}

