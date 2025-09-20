interface Calible {
    void makeCall(String number);
}

interface Messaging {
    void sendMessage(String number, String message);
}

interface Internet {
    void browse(String website);
}

class Smartphone implements Calible, Messaging, Internet {

    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
    }

    public void browse(String website) {
        System.out.println("Browsing Website: " + website);
    }
}

class SmartDevice26 {
    public static void main(String[] args) {
        Smartphone mob = new Smartphone();

        mob.makeCall("7767048197");
        mob.sendMessage("7767048197", "HELLO");
        mob.browse("www.Google.com");
    }
}
