package com.extcode.project.jetpacksubmission1.utils

import com.extcode.project.jetpacksubmission1.R
import com.extcode.project.jetpacksubmission1.data.MovieEntity

object DummyData {

    fun getMovies(): List<MovieEntity> {
        return listOf(
            MovieEntity(
                "m1",
                "A Star Is Born",
                "10/05/2018",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "2h 16m",
                "Drama, Romance, Music",
                R.drawable.poster_a_start_is_born,
                75
            ),
            MovieEntity(
                "m2",
                "Alita: Battle Angel",
                "02/14/2019",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "2h 2m",
                "Action, Science Fiction, Adventure",
                R.drawable.poster_alita,
                71
            ),
            MovieEntity(
                "m3",
                "Aquaman",
                "12/21/2018",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "2h 24m",
                "Action, Adventure, Fantasy",
                R.drawable.poster_aquaman,
                69
            ),
            MovieEntity(
                "m4",
                "Bohemian Rhapsody",
                "11/02/2018",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "2h 15m",
                "Drama, Music",
                R.drawable.poster_bohemian,
                80
            ),
            MovieEntity(
                "m5",
                "Cold Pursuit",
                "02/08/2019",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "1h 59m",
                "Action, Crime, Thriller",
                R.drawable.poster_cold_persuit,
                59
            ),
            MovieEntity(
                "m6",
                "Spider-Man: Into the Spider-Verse",
                "12/14/2018",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "1h 57m",
                "Action, Adventure, Animation, Science Fiction, Comedy",
                R.drawable.poster_spiderman,
                84
            ),
            MovieEntity(
                "m7",
                "Wreck-It Ralph",
                "11/02/2012",
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
                "1h 41m",
                "Family, Animation, Comedy, Adventure",
                R.drawable.poster_ralph,
                73
            ),
            MovieEntity(
                "m8",
                "Avengers: Infinity War",
                "04/27/2018",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "2h 29m",
                "Adventure, Action, Science Fiction",
                R.drawable.poster_infinity_war,
                83
            ),
            MovieEntity(
                "m9",
                "Glass",
                "01/18/2019",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "2h 9m",
                "Thriller, Drama, Science Fiction",
                R.drawable.poster_glass,
                66
            ),
            MovieEntity(
                "m10",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "11/16/2018",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "2h 14m",
                "Adventure, Fantasy, Drama",
                R.drawable.poster_crimes,
                69
            )
        )
    }

    fun getTvShows(): List<MovieEntity> {
        return listOf(
            MovieEntity(
                "tv1",
                "Arrow",
                "2012",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "42m",
                "Crime, Drama, Mystery, Action & Adventure",
                R.drawable.poster_arrow,
                65
            ),
            MovieEntity(
                "tv2",
                "The Flash",
                "2014",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "44m",
                "Drama, Sci-Fi & Fantasy",
                R.drawable.poster_flash,
                75
            ),
            MovieEntity(
                "tv3",
                "Marvel's Iron Fist",
                "2017",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "55m",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                R.drawable.poster_iron_fist,
                64
            ),
            MovieEntity(
                "tv4",
                "Fairy Tail",
                "2009",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "22m",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy",
                R.drawable.poster_fairytail,
                75
            ),
            MovieEntity(
                "tv5",
                "Game of Thrones",
                "2011",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "1h",
                "Sci-Fi & Fantasy, Drama, Action & Adventure, Mystery",
                R.drawable.poster_god,
                83
            ),
            MovieEntity(
                "tv6",
                "Gotham",
                "2014",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "43m",
                "Drama, Fantasy, Crime",
                R.drawable.poster_gotham,
                74
            ),
            MovieEntity(
                "tv7",
                "Naruto Shippūden",
                "2007",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "25m",
                "Animation, Comedy, Drama",
                R.drawable.poster_naruto_shipudden,
                87
            ),
            MovieEntity(
                "tv8",
                "Supergirl",
                "2015",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "42m",
                "Action, Adventure, Drama, Science Fiction",
                R.drawable.poster_supergirl,
                71
            ),
            MovieEntity(
                "tv9",
                "The Umbrella Academy",
                "2019",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "55m",
                "Action & Adventure, Sci-Fi & Fantasy, Comedy, Drama",
                R.drawable.poster_the_umbrella,
                87
            ),
            MovieEntity(
                "tv10",
                "The Walking Dead",
                "2015",
                "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                "43m",
                "Action & Adventure, Drama",
                R.drawable.poster_the_walking_dead,
                74
            )
        )
    }
}