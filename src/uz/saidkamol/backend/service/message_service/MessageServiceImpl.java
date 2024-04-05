package uz.saidkamol.backend.service.message_service;

import uz.saidkamol.backend.model.message.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageServiceImpl implements MessageService {
    private static MessageService messageService;

    private List<Message> messages;

    public MessageServiceImpl() {
        this.messages = new ArrayList<>();
    }

    public static MessageService getInstance() {
        if (messageService == null) {
            messageService = new MessageServiceImpl();
        }
        return messageService;
    }

    @Override
    public void startChat() {

    }
}
