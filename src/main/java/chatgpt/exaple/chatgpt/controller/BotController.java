package chatgpt.exaple.chatgpt.controller;

import chatgpt.example.chatgpt.entities.BotRequest;
import chatgpt.example.chatgpt.entities.ChatGptResponse;
import chatgpt.example.chatgpt.service.BotService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bot")
@RequiredArgsConstructor
public class BotController {

    private final BotService botService;

    @PostMapping("/send")
    public ChatGptResponse sendMessage(@RequestBody @Valid BotRequest botRequest) {
        return botService.askQuestion(botRequest);
    }
}
