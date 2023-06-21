import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    // NINJA BONUS
	// See the specs to overload the guestGreeting method
    public String guestGreeting(String name, String day, String dayPeriod) {
        return String.format("Good %s, %s. Today is %s. Lovely to see you again.", dayPeriod, day, name);
    }
    
    public String dateAnnouncement() {
        return String.format("It's currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if(conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }
        
        return "Right. And with that I shall retire.";
    }

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String byeByeTime(String day) {
        return String.format("Today it's actually %s. It's my day off. I will be back on Monday. Good Bye!", day);
    }
}


