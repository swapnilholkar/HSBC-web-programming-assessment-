package app;

public class TextAndImageNote {

    private String text;
    private String urlText;
	public TextAndImageNote(){

    }

    public void setText(String t){
        text=t;

    }
    public String getText(){
        return text;
    }


    public void setUrlText(String url){
        urlText=url;
        
    }
    public String getUrlText(){
        return urlText;
        
    }

    

}