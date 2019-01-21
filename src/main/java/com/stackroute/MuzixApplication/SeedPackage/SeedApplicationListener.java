//package com.stackroute.MuzixApplication.SeedPackage;
//
//
//import com.stackroute.MuzixApplication.domain.Track;
//
//import com.stackroute.MuzixApplication.repository.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SeedApplicationListener implements ApplicationListener<ContextRefreshedEvent>
//{
//    private TrackRepository songRepository;
//
//    @Autowired
//    public SeedApplicationListener(TrackRepository songRepository)
//    {
//        this.songRepository = songRepository;
//    }
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event)
//    {
//        Track muzix1=new Track(1,"Is mey tera ghata","Gajendra Verma");
//        Track muzix2=new Track(2,"mera swapno ka rani","Kishor Kumar");
//        Track muzix3=new Track(3,"Tum hi ho","Arijit Singh");
//        Track muzix4=new Track(4,"Rain Over me","Mark Anthony");
//        Track muzix5=new Track(5,"Move to the music","RAW theme");
//        Track muzix6=new Track(6,"Broken angle","arash");
//
//        songRepository.save(muzix1);
//        songRepository.save(muzix2);
//        songRepository.save(muzix3);
//        songRepository.save(muzix4);
//        songRepository.save(muzix5);
//        songRepository.save(muzix6);
//
//    }
//}