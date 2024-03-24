package Data.Repositories;

import Data.Exceptions.UsernameAlreadyExistException;
import Data.Model.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImpl implements EntryRepository {
    private List<Entry> entries;

    public EntryRepositoryImpl() {
        this.entries = new ArrayList<>();
    }

    @Override
    public Entry findById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public Entry deleteById(int id) {
        Entry entryToRemove = null;
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                entryToRemove = entry;
                break;
            }
        }
        if (entryToRemove != null) {
            entries.remove(entryToRemove);
        }
        return entryToRemove;
    }

    @Override
    public Entry findEntriesByTitle(String title) {
        return null;
    }

    @Override
    public Entry findEntryByAuthour(String author) {
        return null;
    }

    @Override
    public boolean deleteByEntry(Entry entry) {
        return false;
    }

    @Override
    public Entry save(Entry entry) throws UsernameAlreadyExistException {
        for (Entry existingEntry : entries) {
            if (existingEntry.getUsername().equals(entry.getUsername())) {
                throw new UsernameAlreadyExistException("Username already exists: " + entry.getUsername());
            }
        }
        entries.add(entry);
        return entry;
    }

    @Override
    public List<Entry> findAll() {
        return entries;
    }

    @Override
    public Entry findByTitle(String title) {
        return null;
    }

    @Override
    public long count() {
        return entries.size();
    }

    @Override
    public void deleteById(int id) {
        entries.removeIf(entry -> entry.getId() == id);
    }

    @Override
    public void delete(Entry entry) {
        entries.remove(entry);
    }

    @Override
    public void update(Entry entry) {
        for (Entry existingEntry : entries) {
            if (existingEntry.getId() == entry.getId()) {
                existingEntry.setUsername(entry.getUsername());
                existingEntry.setContent(entry.getContent());
                break;
            }
        }
    }

    @Override
    public Entry findByUsername(String username) {
        for (Entry entry : entries) {
            if (entry.getUsername().equals(username)) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public void deleteByUsername(String username) {
        entries.removeIf(entry -> entry.getUsername().equals(username));
    }
}
