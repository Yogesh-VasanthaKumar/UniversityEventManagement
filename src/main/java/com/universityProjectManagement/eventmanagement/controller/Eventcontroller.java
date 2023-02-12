package com.universityProjectManagement.eventmanagement.controller;

import com.universityProjectManagement.eventmanagement.model.Studentmodel;
import com.universityProjectManagement.eventmanagement.service.Eventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class Eventcontroller {

    @Autowired
    public Eventservice eventservice;

    @GetMapping("/getall")
    public List<Studentmodel> getAll(){
        return eventservice.getAll();
    }
    @GetMapping("/getById")
    public String getByID(@RequestParam int id){
        return "";
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestParam int studentid, String firstname, String lastname, int age, String department){
        return eventservice.addStudent(studentid,firstname,lastname,age,department);
    }

    @PutMapping("updateStudent")
    public String updateByname(@RequestParam int id, String department){
        return eventservice.update(id,department);
    }

    @DeleteMapping("deleteStudent")
    public String deletebyId(@RequestParam int id){
        return eventservice.deletestudent(id);
    }

    @GetMapping("/getEventByDate")
    public String getEventByDate(@RequestParam Date date){
        return "";
    }

    @PostMapping("/addEvent")
    public String addEvent(@RequestParam int eventid, String eventname, String location, Date date, Date starttime, Date endTime, String url){
        return eventservice.addEvent(eventid,eventname,location,date,starttime,endTime,url);
    }

    @PutMapping("updateEvent")
    public String updateEvent(@RequestParam int id, String location){
        return eventservice.updateEvent(id,location);
    }

    @DeleteMapping("deleteEvent")
    public String deleteEvent(@RequestParam int id){
        return eventservice.deleteEvent(id);
    }




}
