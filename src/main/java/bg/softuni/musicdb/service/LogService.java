package bg.softuni.musicdb.service;

import bg.softuni.musicdb.model.service.LogServiceModel;

import java.util.List;

public interface LogService {
    void createLog(String action, Long albumId);

    List<LogServiceModel> findAllLogs();
}
