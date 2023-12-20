package tr.edu.mu.notes;


import com.google.firebase.database.Exclude;

public class Note {

    @Exclude //firebase'te gözükmesini istemediğimiz değişkenler için
    private String id;

}
