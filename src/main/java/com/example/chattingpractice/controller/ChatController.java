package com.example.chattingpractice.controller;

import com.example.chattingpractice.dto.ChatRoom;
import com.example.chattingpractice.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
@Slf4j
public class ChatController {

    private final ChatService chatService;

    //채팅방 생성
    @PostMapping
    public ChatRoom createRoom(@RequestParam String name) {
        return chatService.createRoom(name);
    }

    @GetMapping
    public List<ChatRoom> findAllRoom() {
        return chatService.findAllRoom();
    }
}
