package uz.saidkamol.ui;

import uz.saidkamol.backend.service.message_service.MessageService;
import uz.saidkamol.backend.service.message_service.MessageServiceImpl;
import uz.saidkamol.ui.views.LoginView;

public class FrontEnd {
    private static MessageService messageService = MessageServiceImpl.getInstance();


    public static void main(String[] args) {
        while (true) {
            if (LoginView.CURRENT_USER == null) {
                LoginView.menu();
                continue;
            }

        }
    }
}
