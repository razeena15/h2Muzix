//package com.stackroute.MuzixApplication.SeedPackage;
//
//import com.stackroute.MuzixApplication.domain.Track;
//import com.stackroute.MuzixApplication.repository.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class SeedData implements CommandLineRunner {
//    //Track track;
//    private  TrackRepository trackRepository;
//
//    @Autowired
//    public SeedData(TrackRepository trackRepository)
//    {
//        this.trackRepository = trackRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
////        Track track1=new Track("wake me up","avicii");
//        Track track1=Track.builder().name("wake me up").comment("avicii").build();
//        Track track2=Track.builder().name("Atlantis").comment("Bridgit mendler").build();
//        Track track3=Track.builder().name("hello").comment("adele").build();
//        Track track4=Track.builder().name("Dream on").comment("Aerosmith").build();
//        Track track5=Track.builder().name("Love Stoned").comment("Akcent").build();
//        Track track6=Track.builder().name("Alone").comment("Alan walker").build();
//        Track track7=Track.builder().name("silhouette").comment("Aquillo").build();
//        Track track8=Track.builder().name("Billionaire").comment("Bruno mars").build();
//        Track track9=Track.builder().name("Counting Stars").comment("One republic").build();
//        Track track10=Track.builder().name("addicted to you").comment("avicii").build();
//        trackRepository.save(track1);
//        trackRepository.save(track2);
//        trackRepository.save(track3);
//        trackRepository.save(track4);
//        trackRepository.save(track5);
//        trackRepository.save(track6);
//        trackRepository.save(track7);
//        trackRepository.save(track8);
//        trackRepository.save(track9);
//        trackRepository.save(track10);
//    }
//}
