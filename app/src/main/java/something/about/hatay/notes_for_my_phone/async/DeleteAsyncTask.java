package something.about.hatay.notes_for_my_phone.async;

import android.os.AsyncTask;

import something.about.hatay.notes_for_my_phone.models.Note;
import something.about.hatay.notes_for_my_phone.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.delete(notes);
        return null;
    }
}
