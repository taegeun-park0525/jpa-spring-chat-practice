package com.example.chattingpractice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class ChatMessage {
    public enum MessageType {
        ENTER, TALK
    }
    private MessageType type; //메시지타입
    private String roomId; // 방번호
    private String sender; // 메시지 보낸사람
    private String message; // 메시지
}
