import java.util.Date;

public class AlfredQuotes{
    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello %s, nice to see you again.", name);
    }

    public String dateAnnouncement(){
        return String.format("The current date and time is %s", new Date());
    }

    public String respondBeforeAlexis(String conversation){
        if (conversation.contains("Alexis")){
            return "Oh please, I'm much better than that sellout, Master Wayne";
        }
        else if (conversation.contains("Alfred")){
            return "It'll be done before you can say \"Alfred\"";
        }
        else {
            return "I see I'm no longer needed, I'll be in my room.";
        }
    }
}