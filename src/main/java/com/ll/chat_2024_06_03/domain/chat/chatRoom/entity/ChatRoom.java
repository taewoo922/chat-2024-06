package com.ll.chat_2024_06_03.domain.chat.chatRoom.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter
    private Long id;

    @Getter
    @CreatedDate
    private LocalDateTime createDate;

    @Getter
    @LastModifiedDate
    private LocalDateTime modifyDate;

    @Getter
    private String name;

    public ChatRoom(String name) {
        this.name = name;
    }
}
