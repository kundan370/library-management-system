package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {
    private BookRepository bookRepository;
    private IssueRepository issueRepository;
    private IssuerRepository issuerRepository;

    public DBSeeder(BookRepository bookRepository, IssueRepository issueRepository, IssuerRepository issuerRepository) {
        this.bookRepository = bookRepository;
        this.issueRepository = issueRepository;
        this.issuerRepository = issuerRepository;
    }

    @Override
    public void run(String... args) {
        Book book1  = new Book("English Grammer Book", "Author 1", "2016", new LibraryLocation(1, 1),
                Arrays.asList(Category.GRAMMER.getCategory(), Category.ENGLISH.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X, Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book2  = new Book("Hindi Grammer Book", "Author 2", "2016", new LibraryLocation(1, 2),
                Arrays.asList(Category.GRAMMER.getCategory(), Category.HINDI.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X, Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book3  = new Book("High School English Literature Book", "Author 3", "2016", new LibraryLocation(1, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.ENGLISH.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book4  = new Book("Intermediate English Literature Book", "Author 3", "2016", new LibraryLocation(3, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.ENGLISH.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book5  = new Book("Intermediate Hindi Literature Book", "Author 4", "2016", new LibraryLocation(3, 2),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.HINDI.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book6  = new Book("High School Hindi Literature Book", "Author 4", "2016", new LibraryLocation(1, 4),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.HINDI.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book7  = new Book("High School History and Civics Book", "Author 5", "2016", new LibraryLocation(1, 5),
                Arrays.asList(Category.SOCIAL_SCIENCE.getCategory(), Category.HISTORY.getCategory(), Category.CIVICS.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book8  = new Book("High School Geography Book", "Author 6", "2016", new LibraryLocation(1, 6),
                Arrays.asList(Category.SOCIAL_SCIENCE.getCategory(), Category.GEOGRAPHY.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book9  = new Book("High School History and Civics Book", "Author 5", "2018", new LibraryLocation(1, 5),
                Arrays.asList(Category.SOCIAL_SCIENCE.getCategory(), Category.HISTORY.getCategory(), Category.CIVICS.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book10  = new Book("High School Geography Book", "Author 6", "2018", new LibraryLocation(1, 6),
                Arrays.asList(Category.SOCIAL_SCIENCE.getCategory(), Category.GEOGRAPHY.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book11  = new Book("High School Mathematics Book", "Author 7", "2016", new LibraryLocation(2, 1),
                Arrays.asList(Category.MATHS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book12  = new Book("High School Physics Book", "Author 8", "2016", new LibraryLocation(2, 2),
                Arrays.asList(Category.PHYSICS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book13  = new Book("High School Chemistry Book", "Author 9", "2016", new LibraryLocation(2, 3),
                Arrays.asList(Category.CHEMISTRY.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book14  = new Book("High School Biology Book", "Author 10", "2016", new LibraryLocation(2, 4),
                Arrays.asList(Category.BIOLOGY.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book15 = new Book("High School Computer Science Book", "Author 11", "2016", new LibraryLocation(2, 5),
                Arrays.asList(Category.COMPUTERS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book16  = new Book("High School Mathematics Book", "Author 7", "2018", new LibraryLocation(2, 1),
                Arrays.asList(Category.MATHS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book17  = new Book("High School Physics Book", "Author 8", "2018", new LibraryLocation(2, 2),
                Arrays.asList(Category.PHYSICS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book18  = new Book("High School Chemistry Book", "Author 9", "2018", new LibraryLocation(2, 3),
                Arrays.asList(Category.CHEMISTRY.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book19  = new Book("High School Biology Book", "Author 10", "2018", new LibraryLocation(2, 4),
                Arrays.asList(Category.BIOLOGY.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book20 = new Book("High School Computer Science Book", "Author 11", "2018", new LibraryLocation(2, 5),
                Arrays.asList(Category.COMPUTERS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book21  = new Book("Intermediate Mathematics Book", "Author 7", "2016", new LibraryLocation(3, 3),
                Arrays.asList(Category.MATHS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book22  = new Book("Intermediate Physics Book", "Author 8", "2016", new LibraryLocation(3, 4),
                Arrays.asList(Category.PHYSICS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book23  = new Book("Intermediate Chemistry Book", "Author 9", "2016", new LibraryLocation(3, 5),
                Arrays.asList(Category.CHEMISTRY.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book24  = new Book("Intermediate Biology Book", "Author 10", "2016", new LibraryLocation(3, 6),
                Arrays.asList(Category.BIOLOGY.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book25 = new Book("Intermediate Computer Science Book", "Author 11", "2016", new LibraryLocation(3, 7),
                Arrays.asList(Category.COMPUTERS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book26  = new Book("Intermediate Mathematics Book", "Author 7", "2018", new LibraryLocation(3, 3),
                Arrays.asList(Category.MATHS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book27  = new Book("Intermediate Physics Book", "Author 8", "2018", new LibraryLocation(3, 4),
                Arrays.asList(Category.PHYSICS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book28  = new Book("Intermediate Chemistry Book", "Author 9", "2018", new LibraryLocation(3, 5),
                Arrays.asList(Category.CHEMISTRY.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book29  = new Book("Intermediate Biology Book", "Author 10", "2018", new LibraryLocation(3, 6),
                Arrays.asList(Category.BIOLOGY.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book30 = new Book("Intermediate Computer Science Book", "Author 11", "2018", new LibraryLocation(3, 7),
                Arrays.asList(Category.COMPUTERS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book31 = new Book("Advanced JAVA", "Author 12", "2016", new LibraryLocation(3, 7),
                Arrays.asList(Category.COMPUTERS.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book32 = new Book("Encyclopaedia", "Encarta", "2000", new LibraryLocation(2, 6),
                Arrays.asList(Category.GENERAL.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.VIII, Issuer.Clazz.IX, Issuer.Clazz.X, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book33 = new Book("Encyclopaedia", "Encarta", "2005", new LibraryLocation(2, 6),
                Arrays.asList(Category.GENERAL.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.VIII, Issuer.Clazz.IX, Issuer.Clazz.X, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book34 = new Book("Encyclopaedia", "Encarta", "2010", new LibraryLocation(2, 6),
                Arrays.asList(Category.GENERAL.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.VIII, Issuer.Clazz.IX, Issuer.Clazz.X, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book35 = new Book("Encyclopaedia", "Encarta", "2015", new LibraryLocation(2, 6),
                Arrays.asList(Category.GENERAL.getCategory(), Category.SCIENCE.getCategory()), Arrays.asList(Issuer.Clazz.VIII, Issuer.Clazz.IX, Issuer.Clazz.X, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book36 = new Book("Julius Caesar", "Author 13", "2016", new LibraryLocation(1, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.ENGLISH.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book37 = new Book("Macbeth", "Author 13", "2016", new LibraryLocation(3, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.ENGLISH.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book38 = new Book("Art", "Author 14", "2016", new LibraryLocation(1, 7),
                Collections.singletonList(Category.ART.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), false);

        Book book39 = new Book("Photography", "Author 15", "2016", new LibraryLocation(1, 8),
                Collections.singletonList(Category.PHOTOGRAPHY.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), false);

        Book book40 = new Book("High School Commerce Book", "Author 16", "2016", new LibraryLocation(3, 8),
                Collections.singletonList(Category.COMMERCE.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book41 = new Book("Intermediate Commerce Book", "Author 16", "2016", new LibraryLocation(2, 7),
                Collections.singletonList(Category.COMMERCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book42 = new Book("Intermediate Accounts Book", "Author 17", "2016", new LibraryLocation(2, 8),
                Collections.singletonList(Category.ACCOUNTS.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book43 = new Book("Intermediate Economics Book", "Author 18", "2016", new LibraryLocation(2, 9),
                Collections.singletonList(Category.ECONOMICS.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book44 = new Book("High School Environmental Studies", "Author 19", "2016", new LibraryLocation(1, 9),
                Collections.singletonList(Category.EVS.getCategory()), Arrays.asList(Issuer.Clazz.IX, Issuer.Clazz.X), true);

        Book book45 = new Book("Intermediate Environmental Studies", "Author 19", "2016", new LibraryLocation(3, 9),
                Collections.singletonList(Category.EVS.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII), true);

        Book book46 = new Book("Jane Eyre", "Charlotte Bronte", "2016", new LibraryLocation(4, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.CLASSIC.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book47 = new Book("Wuthering Heights", "Emily Brontë", "2016", new LibraryLocation(4, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.CLASSIC.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book48 = new Book("Moby Dick", "Herman Melville", "2016", new LibraryLocation(4, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.CLASSIC.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book49 = new Book("Pride and Prejudice", "Jane Austen", "2016", new LibraryLocation(4, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.CLASSIC.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book50 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "2016", new LibraryLocation(4, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.CLASSIC.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book51 = new Book("Frankenstein", "Mary Shelley", "2016", new LibraryLocation(4, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.CLASSIC.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book52 = new Book("Robison Crusoe", "Daniel Defoe", "2016", new LibraryLocation(4, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.CLASSIC.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book53 = new Book("Little Women", "Louisa May Alcott", "2016", new LibraryLocation(4, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.CLASSIC.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book54 = new Book("Crime and Punishment", "Fyodor Dostoyevsky", "2016", new LibraryLocation(4, 1),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.CLASSIC.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book55 = new Book("The Notebook", "Nicholas Sparks", "2016", new LibraryLocation(4, 2),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.ROMANCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book56 = new Book("The Next Always", "Nora Roberts", "2016", new LibraryLocation(4, 2),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.ROMANCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book57 = new Book("The Kiss", "Danielle Steel", "2016", new LibraryLocation(4, 2),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.ROMANCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book58 = new Book("The Sweetest Thing", "Barbara Freethy", "2016", new LibraryLocation(4, 2),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.ROMANCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book59 = new Book("A Second Chance", "Ellen Wolf", "2016", new LibraryLocation(4, 2),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.ROMANCE.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book60 = new Book("Where We Belong", "Emily Giffin", "2016", new LibraryLocation(4, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.MYSTERY.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book61 = new Book("I've Got Your Number", "Sophie Kinsella", "2016", new LibraryLocation(4, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.MYSTERY.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book62 = new Book("Another Piece of My Heart", "Jane Green", "2016", new LibraryLocation(4, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.MYSTERY.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book63 = new Book("The Next Best Thing: A Novel", "Jennifer Weiner", "2016", new LibraryLocation(4, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.MYSTERY.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book64 = new Book("Summerland: A Novel", "Elin Hilderbrand", "2016", new LibraryLocation(4, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.MYSTERY.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book65 = new Book("A Time to Kill", "Author 20", "2016", new LibraryLocation(4, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.THRILLER.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book66 = new Book("The Pelican Brief", "Author 22", "2016", new LibraryLocation(4, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.THRILLER.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book67 = new Book("The Firm", "Author 23", "2016", new LibraryLocation(4, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.THRILLER.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book68 = new Book("The Rainmaker", "Author 24", "2016", new LibraryLocation(4, 3),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.THRILLER.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book69 = new Book("The Unloved", "John Saul", "2016", new LibraryLocation(4, 4),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.HORROR.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book70 = new Book("The Final Winter", "Iain Rob Wright", "2016", new LibraryLocation(4, 4),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.HORROR.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book71 = new Book("The Devil Tree", "Steve Vernon", "2016", new LibraryLocation(4, 4),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.HORROR.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        Book book72 = new Book("The Sentinel", "Jeremy Bishop", "2016", new LibraryLocation(4, 4),
                Arrays.asList(Category.LITERATURE.getCategory(), Category.NOVEL.getCategory(), Category.HORROR.getCategory()), Arrays.asList(Issuer.Clazz.XI, Issuer.Clazz.XII, Issuer.Clazz.XI, Issuer.Clazz.XII), false);

        List<Book> books = Arrays.asList(book1, book2, book3, book4, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15, book16, book17, book18, book19, book20,
                book21, book22, book23, book24, book25, book26, book27, book28, book29, book30, book31, book32, book33, book34, book35, book36, book37, book38, book39, book40, book41, book42, book43, book44, book45,
                book46, book47, book48, book49, book50, book51, book52, book53, book54, book55, book56, book57, book58, book59, book60, book61, book62, book63, book64, book65, book66, book67, book68, book69, book70, book71, book72);

        Issuer s1 = new Issuer("Kundan Kumar", Issuer.Clazz.XI, Issuer.Section.SCIENCE, Issuer.Role.STUDENT);
        Issuer s2 = new Issuer("Anurag Sharma", Issuer.Clazz.X, Issuer.Section.B, Issuer.Role.STUDENT);
        List<Issuer> issuers = Arrays.asList(s1, s2);

        // drop all books issuers and issues from the database
        this.bookRepository.deleteAll();
        this.issueRepository.deleteAll();
        this.issuerRepository.deleteAll();


        // seed the collection
        this.bookRepository.saveAll(books);
        this.issuerRepository.saveAll(issuers);
    }
}
