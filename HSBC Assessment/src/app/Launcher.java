package app;

import java.util.ArrayList;

public class Launcher {
    static NoteStore ns = new NoteStore();
    static ArrayList<TextNote> storeText = new ArrayList<TextNote>();
    static ArrayList<TextAndImageNote> storeImageText = new ArrayList<TextAndImageNote>();



    static void displayTextNotes() {
        
        storeText = ns.getAllTextNotes();

        for(TextNote ele : storeText){
            System.out.println(ele.getText());
        }
    }

    static void displayTextAndImageNotes() {
        
        
        storeImageText = ns.getAllTextAndImageNotes();

        for(TextAndImageNote ele : storeImageText){
            System.out.println(ele.getText()+","+ele.getUrlText());
        }
    }




    public static void main(String[] args) throws Exception {

        String text_note_1="Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems";
        String text_note_2="Few books to read -Ikigai, How to wn friends and infludence people";

        String textimage_note_1 = "The shopping list on my fridge";
        String textimage_note_2 = "The size label of Jacks shirt";
        String texturl_note_1="//url/image/img.jpg";
        String texturl_note_2="//url/image/img2.jpg";


        // NoteStore ns = new NoteStore();
        ns.storeNote(text_note_1);
        ns.storeNote(text_note_2);

        //for the text and url
        ns.storeNote(textimage_note_1, texturl_note_1);
        ns.storeNote(textimage_note_2, texturl_note_2);


        //with method
        displayTextNotes();
        displayTextAndImageNotes();
        
        


    }


     


}

