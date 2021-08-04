package something.about.hatay.notes_for_my_phone.async;

import android.os.AsyncTask;

import something.about.hatay.notes_for_my_phone.models.Note;
import something.about.hatay.notes_for_my_phone.persistence.NoteDao;

public class InsertAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public InsertAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.insertNotes(notes);
        return null;
    }
}
