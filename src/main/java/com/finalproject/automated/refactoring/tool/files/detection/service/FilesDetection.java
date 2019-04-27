package com.finalproject.automated.refactoring.tool.files.detection.service;

import com.finalproject.automated.refactoring.tool.files.detection.model.FileModel;
import lombok.NonNull;

import java.util.List;
import java.util.Map;

/**
 * @author M. Reza Pahlevi
 * @version 1.0.0
 * @since 27 April 2019
 */

public interface FilesDetection {

    List<FileModel> detect(@NonNull String path, @NonNull String mimeType);

    Map<String, List<FileModel>> detect(@NonNull List<String> paths, @NonNull String mimeType);
}
