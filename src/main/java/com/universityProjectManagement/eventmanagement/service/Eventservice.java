package com.universityProjectManagement.eventmanagement.service;

import com.universityProjectManagement.eventmanagement.model.Eventmodel;
import com.universityProjectManagement.eventmanagement.model.Studentmodel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class Eventservice {

    private List<Eventmodel> eventmodelList;
    private int eventcount;

    private static List<Studentmodel> studentmodelList = new ArrayList<>();
    private int studentcount;

    public String addStudent(int studentid, String firstname, String lastname, int age, String department){
        studentmodelList.add(new Studentmodel(studentid,firstname,lastname,age,department));
        return("created");
    }

    public String update(int studentid, String department){
        for(Studentmodel a:studentmodelList){
            if(a.getStudentid()==studentid){
                a.setDepartment(department);
                return "Updated";
            }

        }
        return "Not Found";
    }

    public String deletestudent(int studentid){
        for(Studentmodel a:studentmodelList){
            if(a.getStudentid()==studentid){
                studentmodelList.remove(a);
                return "deleted";
            }

        }
        return "Not Found";
    }

    public List<Studentmodel> getAll(){
        return studentmodelList;
    }

    public Studentmodel getById(int id){
        for(Studentmodel a:studentmodelList){
            if(a.getStudentid()==id){
                return a;
            }
        }
        return null;
    }

    public String addEvent(int eventid, String eventname, String location, Date date, Date starttime, Date endTime, String url){
        eventmodelList.add(new Eventmodel(eventid,eventname,location,date,starttime,endTime,url));
        return("created");
    }

    public String updateEvent(int eventid, String location){
        for(Eventmodel a:eventmodelList){
            if(a.getEventid()==eventid){
                a.setLocation(location);
                return "Updated";
            }

        }
        return "Not Found";
    }


    public String deleteEvent(int eventId){
        for(Eventmodel a:eventmodelList){
            if(a.getEventid()==eventId){
                eventmodelList.remove(a);
                return "deleted";
            }

        }
        return "Not Found";
    }





}
