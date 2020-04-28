package com.pms.notificationService.email.service;

import com.pms.domain.models.EmailEntity;

public interface IEmailService {
	public boolean sendEmail(EmailEntity emailEntity);
}
