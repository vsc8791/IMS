package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Schedule;

public interface ScheduleService {

	public List<Schedule> getSchedules();
	public void saveSchedule(Schedule theSchedule);
	public Schedule getSchedule(int theId);
	public void deleteSchedule(int theId);
	
}
