package app;

import java.util.ArrayList;

public class NoteStore {

    ArrayList<TextNote> text_notes = new ArrayList<TextNote>();
    ArrayList<TextAndImageNote> text_and_image_notes = new ArrayList<TextAndImageNote>();
	
	public NoteStore(){


    }
    

    public void storeNote(String note){

        TextNote tn = new TextNote();
        tn.setText(note);
        

        text_notes.add(tn);


    }

    public void storeNote(String note,String url){
        TextAndImageNote tin = new TextAndImageNote();
        tin.setText(note);
        tin.setUrlText(url);

        text_and_image_notes.add(tin);

    }


    public ArrayList<TextNote> getAllTextNotes(){
        return text_notes;

    }

    public ArrayList<TextAndImageNote> getAllTextAndImageNotes(){
        return text_and_image_notes;
    }

    

}