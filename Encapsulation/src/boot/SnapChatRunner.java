package boot;

import app.SnapChat;

public class SnapChatRunner {
	public static void main(String[] args) {
		SnapChat mySnapChat = new SnapChat();

		mySnapChat.setUserName("Varsha");
		mySnapChat.setDisplayName("Varshabr");
		mySnapChat.setEmail("varsha@gmail.com");
		mySnapChat.setPhoneNumber("+7760622942");
		mySnapChat.setBitmojiAvatar("bitmoji.png");
		mySnapChat.setStatus("Feeling adventurous!");
		mySnapChat.setSnapScore(5000);
		mySnapChat.setFriendsCount(300);
		mySnapChat.setFollowersCount(100);
		mySnapChat.setStreakCount(15);
		mySnapChat.setPrivateAccount(false);
		mySnapChat.setVerified(true);
		mySnapChat.setLastActive("2023-08-10 15:30");
		mySnapChat.setReceivedSnaps(50);

		System.out.println("User Name: " + mySnapChat.getUserName());
		System.out.println("Display Name: " + mySnapChat.getDisplayName());
		System.out.println("Email: " + mySnapChat.getEmail());
		System.out.println("Phone Number: " + mySnapChat.getPhoneNumber());
		System.out.println("Bitmoji Avatar: " + mySnapChat.getBitmojiAvatar());
		System.out.println("Status: " + mySnapChat.getStatus());
		System.out.println("Snap Score: " + mySnapChat.getSnapScore());
		System.out.println("Friends Count: " + mySnapChat.getFriendsCount());
		System.out.println("Followers Count: " + mySnapChat.getFollowersCount());
		System.out.println("Streak Count: " + mySnapChat.getStreakCount());
		System.out.println("Private Account: " + mySnapChat.isPrivateAccount());
		System.out.println("Verified: " + mySnapChat.isVerified());
		System.out.println("Last Active: " + mySnapChat.getLastActive());
		System.out.println("Received Snaps: " + mySnapChat.getReceivedSnaps());
	}


}
