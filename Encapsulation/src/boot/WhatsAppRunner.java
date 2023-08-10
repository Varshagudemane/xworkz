package boot;

import app.WhatsApp;

public class WhatsAppRunner {
	public static void main(String[] args) {
        WhatsApp myWhatsApp = new WhatsApp();

        myWhatsApp.setUserName("Varsha");
        myWhatsApp.setPhoneNumber("+7760622942");
        myWhatsApp.setProfilePicture("profile.jpg");
        myWhatsApp.setStatus("Hello, I'm using WhatsApp!");
        myWhatsApp.setLastSeen("2023-08-10 15:30");
        myWhatsApp.setMessageNotifications(true);
        myWhatsApp.setGroupNotifications(true);
        myWhatsApp.setDarkMode(false);
        myWhatsApp.setMediaShared(50);
        myWhatsApp.setTotalContacts(150);
        myWhatsApp.setBlockedContacts(10);
        myWhatsApp.setFavoriteContacts(5);
        myWhatsApp.setChatHistory("Chat with me");
        myWhatsApp.setUnreadMessages(3);

        System.out.println("User Name: " + myWhatsApp.getUserName());
        System.out.println("Phone Number: " + myWhatsApp.getPhoneNumber());
        System.out.println("Profile Picture: " + myWhatsApp.getProfilePicture());
        System.out.println("Status: " + myWhatsApp.getStatus());
        System.out.println("Last Seen: " + myWhatsApp.getLastSeen());
        System.out.println("Message Notifications: " + myWhatsApp.isMessageNotifications());
        System.out.println("Group Notifications: " + myWhatsApp.isGroupNotifications());
        System.out.println("Dark Mode: " + myWhatsApp.isDarkMode());
        System.out.println("Media Shared: " + myWhatsApp.getMediaShared());
        System.out.println("Total Contacts: " + myWhatsApp.getTotalContacts());
        System.out.println("Blocked Contacts: " + myWhatsApp.getBlockedContacts());
        System.out.println("Favorite Contacts: " + myWhatsApp.getFavoriteContacts());
        System.out.println("Chat History: " + myWhatsApp.getChatHistory());
        System.out.println("Unread Messages: " + myWhatsApp.getUnreadMessages());
    }

}
