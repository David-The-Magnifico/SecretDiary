package Services;

import Data.Model.Entry;
import dto.request.CreateEntryRequest;
import dto.request.DeleteEntryRequest;
import dto.request.UpdateRequest;

import java.util.List;

public interface EntryService {

    Entry createEntry(CreateEntryRequest request);

    void deleteEntry(DeleteEntryRequest request);

    Entry updateEntry(UpdateRequest request);

    List<Entry> findEntriesByUsername(String username);

}
