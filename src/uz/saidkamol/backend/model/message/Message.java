package uz.saidkamol.backend.model.message;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Message {
    private final UUID id = UUID.randomUUID();

    private UUID chatId;

    private String text;

    private final ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public Message(UUID chatId, String text) {
        this.chatId = chatId;
        this.text = text;
    }

    public UUID getId() {
        return id;
    }

    public UUID getChatId() {
        return chatId;
    }

    public void setChatId(UUID chatId) {
        this.chatId = chatId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    @Override
    public String toString() {
        return text;
    }
}
