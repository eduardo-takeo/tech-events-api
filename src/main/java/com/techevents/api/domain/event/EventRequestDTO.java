package com.techevents.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, String city, String state, MultipartFile image, String eventUrl, Boolean remote, Long date) {
}
