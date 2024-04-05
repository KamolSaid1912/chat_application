package uz.saidkamol.backend.model.chat;

import uz.saidkamol.backend.enums.ChatType;

import java.util.UUID;

public class Chat {
    private final UUID uuid = UUID.randomUUID();

    private ChatType type;

    private UUID[] usersId;

    public UUID getUuid() {
        return uuid;
    }

    public ChatType getType() {
        return type;
    }

    public void setType(ChatType type) {
        this.type = type;
    }
}
