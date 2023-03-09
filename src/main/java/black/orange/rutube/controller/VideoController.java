package black.orange.rutube.controller;

import black.orange.rutube.dto.VideoDTO;
import black.orange.rutube.entity.Video;
import black.orange.rutube.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/video")
public class VideoController {
    private VideoService videoService;

    @PostMapping
    public ResponseEntity<Video> addVideo(@RequestBody VideoDTO videoDTO) {
        return ResponseEntity.ok(videoService.addVideo(videoDTO));
    }
}