package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by boumi.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}