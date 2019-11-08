package com.gof.mediator.vers1;

public class SimpleChatRunner {

  public static void main(String[] args) {
    SmpleTextChat chat = new SmpleTextChat();

    User admin = new Admin(chat, "admin");
    User user1 = new SimpleUser(chat, " User 1");
    User user2 = new SimpleUser(chat, " User 2");

    chat.setAdmin(admin);
    chat.addUserToChat(user1);
    chat.addUserToChat(user2);

    user1.sentMessage("Hello I.am user1");
    admin.sentMessage("Roger that, I am ADMIN");
  }
}
