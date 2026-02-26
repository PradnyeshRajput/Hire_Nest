package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modals.Application;
import com.example.demo.Modals.Notification;
import com.example.demo.Repository.ApplicationRepository;
import com.example.demo.Repository.NotificationRepository;

@Service
public class AppliactionService {

    @Autowired
    private ApplicationRepository appRepo;

    @Autowired
    private NotificationRepository notifRepo;

    public Application updateStatus(Long appId, String status) {

        Application app = appRepo.findById(appId).orElse(null);

        if(app != null) {
            app.setStatus(status);
            appRepo.save(app);

            Notification notif = new Notification();
            notif.setStudent(app.getStudent());
            notif.setMessage("Your application status updated to " + status);

            notifRepo.save(notif);
        }

        return app;
    }
}