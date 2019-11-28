package com.example.activitisanimatedtransition;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activitisanimatedtransition.adapters.ProfileAdapter;
import com.example.activitisanimatedtransition.data.Profile;

import java.util.ArrayList;
import java.util.List;





public class MainActivity extends AppCompatActivity {
    private List<Profile> profiles;
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.profiles_list);

        profiles = getProfiles();

        ProfileAdapter pa = new ProfileAdapter(this, profiles);
        rv.setAdapter(pa);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Profile> getProfiles() {
        List<Profile> profileList = new ArrayList<>();

        Profile profileOne = getProfileOne();
        Profile profileTwo = getProfileTwo();
        Profile profileThree = getProfileThree();
        Profile profileFour = getProfileFour();
        Profile profileFive = getProfileFive();
        Profile profileSix = getProfileSix();
        Profile profileSeven = getProfileSeven();
        Profile profileEight = getProfileEight();
        Profile profileNine = getProfileNine();
        Profile profileTen = getProfileTen();


        profileList.add(profileOne);
        profileList.add(profileTwo);
        profileList.add(profileThree);
        profileList.add(profileFour);
        profileList.add(profileFive);
        profileList.add(profileSix);
        profileList.add(profileSeven);
        profileList.add(profileEight);
        profileList.add(profileNine);
        profileList.add(profileTen);

        return  profileList;
    }

    private Profile getProfileOne(){
        Profile profile = new Profile();
        profile.setBio("Description");
        profile.setName("Black Widow");
        profile.setImage(R.drawable.widow);
        return profile;
    }

    private Profile getProfileTwo(){
        Profile profile = new Profile();
        profile.setBio("Created by artist/writer Rob Liefeld and writer Fabian Nicieza, Deadpool made his first appearance in the pages of The New Mutants  cover dated February 1991. According to Nicieza, Liefeld came up with the character's visual design and name, and Nicieza himself came up with the character's speech mannerisms.");
        profile.setName("Deadpool");
        profile.setImage(R.drawable.deadpool);
        return profile;
    }

    private Profile getProfileThree(){
        Profile profile = new Profile();
        profile.setBio("In present-day Paris, Diana receives a photographic plate from Wayne Enterprises of herself and four men taken during World War I, prompting her to recall her past. The daughter of Queen Hippolyta, Diana is raised on the hidden island of Themyscira, home to the Amazonian women warriors created by Zeus to protect mankind.");
        profile.setName("Wonder Woman");
        profile.setImage(R.drawable.wonder);
        return profile;
    }

    private Profile getProfileFour(){
        Profile profile = new Profile();
        profile.setBio("Black Panther is a fictional superhero appearing in American comic books published by Marvel Comics. The character was created by writer-editor Stan Lee and writer-artist Jack Kirby, first appearing in Fantastic Four  (cover-dated July 1966) in the Silver Age of Comic Books. Black Panther's real name is T'Challa, king and protector of the fictional African nation of Wakanda. Along with possessing enhanced abilities achieved through ancient Wakandan rituals of drinking the essence of the heart-shaped herb, T'Challa also relies on his proficiency in science, rigorous physical training, hand-to-hand combat skills, and access to wealth and advanced Wakandan technology to combat his enemies.");
        profile.setName("Black Panther");
        profile.setImage(R.drawable.black_panther);
        return profile;
    }

    private Profile getProfileFive(){
        Profile profile = new Profile();
        profile.setBio("In 1995, on the Kree Empire's capital planet of Hala, Starforce member Vers suffers from amnesia and recurring nightmares involving an older woman. Yon-Rogg, her mentor and commander, trains her to control her abilities while the Supreme Intelligence, the artificial intelligence that rules the Kree, urges her to keep her emotions in check.");
        profile.setName("Captain Marvel");
        profile.setImage(R.drawable.marvel);
        return profile;
    }

    private Profile getProfileSix(){
        Profile profile = new Profile();
        profile.setBio("In Kathmandu, the sorcerer Kaecilius and his zealots enter the secret compound Kamar-Taj and behead its librarian. They steal a few pages from an ancient, mystical text belonging to the Ancient One, a long-lived sorcerer who has taught every student at Kamar-Taj, including Kaecilius, in the mystic arts. The Ancient One pursues the traitors, but Kaecilius and his followers escape.");
        profile.setName("Doctor Strange");
        profile.setImage(R.drawable.strange);
        return profile;
    }

    private Profile getProfileSeven(){
        Profile profile = new Profile();
        profile.setBio("Thanos was born on Saturn's moon Titan as the son of Eternals A'lars and Sui-San; his brother is Eros of Titan. Thanos carries the Deviants gene, and as such, shares the physical appearance of the Eternals' cousin race. Shocked by his appearance and the belief that he would destroy all life in the universe, Sui-San attempted to kill him, but she was stopped by A'lars. During his school years, Thanos was a pacifist and would only play with his brother Eros and pets.");
        profile.setName("Thanos");
        profile.setImage(R.drawable.thanos);
        return profile;
    }

    private Profile getProfileEight(){
        Profile profile = new Profile();
        profile.setBio("Thor's father Odin decides his son needed to be taught humility and consequently places Thor (without memories of godhood) into the body and memories of an existing, partially disabled human medical student, Donald Blake. After becoming a doctor, Blake witnesses the arrival of an alien scouting party while he is on vacation in Norway");
        profile.setName("Thor");
        profile.setImage(R.drawable.thor);
        return profile;
    }

    private Profile getProfileNine(){
        Profile profile = new Profile();
        profile.setBio("During the experimental detonation of a gamma bomb, scientist Robert Bruce Banner saves teenager Rick Jones who has driven onto the testing field; Banner pushes Jones into a trench to save him, but is hit with the blast, absorbing massive amounts of gamma radiation. He awakens later seemingly unscathed, but that night transforms into a lumbering grey form. A pursuing soldier dubs the creature a \"hulk\".");
        profile.setName("Hulk");
        profile.setImage(R.drawable.hulk);
        return profile;
    }

    private Profile getProfileTen(){
        Profile profile = new Profile();
        profile.setBio("Wolverine was born as James Howlett in northern Alberta, Canada, during the late 1880s, purportedly to rich farm owners John and Elizabeth Howlett, though he is actually the illegitimate son of the Howletts' groundskeeper, Thomas Logan. After Thomas is thrown off the Howletts' property for an attempted rape perpetrated by his other son, named simply Dog, he returns to the Howlett manor and kills John Howlett. ");
        profile.setName("Wolverine");
        profile.setImage(R.drawable.wolverine);
        return profile;
    }
}
