package something.about.hatay.notes_for_my_phone.persistence;

import android.content.Context;

import java.util.List;

import androidx.lifecycle.LiveData;
import something.about.hatay.notes_for_my_phone.async.DeleteAsyncTask;
import something.about.hatay.notes_for_my_phone.async.InsertAsyncTask;
import something.about.hatay.notes_for_my_phone.async.UpdateAsyncTask;
import something.about.hatay.notes_for_my_phone.models.Note;

public class NoteRepository {

    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note){
        new InsertAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public void updateNoteTask(Note note){
        new UpdateAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public LiveData<List<Note>> retrieveNotesTask() {
        return mNoteDatabase.getNoteDao().getNotes();
    }

    public void deleteNoteTask(Note note){
        new DeleteAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

}
