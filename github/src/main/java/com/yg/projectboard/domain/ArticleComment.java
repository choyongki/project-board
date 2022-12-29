package com.yg.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;            // 게시글
    private String content;             // 본문

    private LocalDateTime createdAt;    // 생성일시
    private String createdBy;           // 생성자
    private LocalDateTime updatedAt;    // 수정일시
    private String updatedBy;           // 수정자
    private LocalDateTime deletedAt;    // 삭제일시
    private String deletedBy;           // 삭제자

}
